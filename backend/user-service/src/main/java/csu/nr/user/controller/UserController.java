package csu.nr.user.controller;

import csu.nr.user.service.IUserService;
import csu.nr.api.domain.dto.LoginFormDTO;
import csu.nr.api.domain.vo.UserLoginVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户相关接口")
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor // Lombok annotation to generate a constructor with required arguments
public class UserController {
    private final IUserService userService;

    @ApiOperation("用户登录接口")
    @PostMapping("login")
    public UserLoginVO login(@RequestBody @Validated LoginFormDTO loginFormDTO) {
        // @Validated is used to validate the request body
        return userService.login(loginFormDTO);
    }
}
