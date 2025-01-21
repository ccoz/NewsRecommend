package csu.nr.gateway.filters;

import csu.nr.common.exception.UnauthorizedException;
import csu.nr.gateway.config.AuthProperties;
import csu.nr.gateway.utils.JwtTool;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AuthGlobalFilter implements GlobalFilter, Ordered {
    private final AuthProperties authProperties;
    private final JwtTool jwtTool;
    private final AntPathMatcher antPathMatcher = new AntPathMatcher();
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 1.获取request
        ServerHttpRequest request = exchange.getRequest();
        // 2.判断是否需要校验
        if(isExclude(request.getPath().toString())){
            return chain.filter(exchange);
        }
        // 3.获取token
        String token = null;
        List<String> headers = request.getHeaders().get("authorization");
        if(headers != null && !headers.isEmpty()){
            token = headers.get(0);
        }
        // 4.校验token
        Long userId = null;
        try {
            userId = jwtTool.parseToken(token);
        }catch (UnauthorizedException e){
            // 拦截，设置响应状态码为401
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            return response.setComplete();
        }
        // 5.传递用户信息
        String userInfo = userId.toString();
        ServerWebExchange swe = exchange.mutate().request(builder -> builder.header("user-info", userInfo)).build();
        // 6.放行
        return chain.filter(swe);
    }
    private boolean isExclude(String path){
        for(String pattern : authProperties.getExcludePaths()){
            if(antPathMatcher.match(pattern, path)){
                return true;
            }
        }
        return false;
    }
    @Override
    public int getOrder() {
        return 0;
    }
}
