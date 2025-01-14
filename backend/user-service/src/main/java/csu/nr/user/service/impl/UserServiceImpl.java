package csu.nr.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import csu.nr.user.mapper.UserMapper;
import csu.nr.user.service.IUserService;
import csu.nr.api.domain.dto.LoginFormDTO;
import csu.nr.api.domain.po.User;
import csu.nr.api.domain.vo.UserLoginVO;
import csu.nr.api.enums.UserStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Override
    public UserLoginVO login(LoginFormDTO loginFormDTO) {
        // 1.获取用户数据
        String username = loginFormDTO.getUsername();
        String password = loginFormDTO.getPassword();
        // 2.根据用户名查询用户
        User user = lambdaQuery().eq(User::getUsername, username).one();
        Assert.notNull(user, "用户不存在");
        // 3.校验是否冻结
        if (user.getStatus() == UserStatus.FROZEN) {
            throw new IllegalArgumentException("用户已冻结");
        }
        // 4.校验密码
        if (!password.equals(user.getPassword())) {
            throw new IllegalArgumentException("密码错误");
        }
        // 5.生成token
        // String token = jwtTool.createToken(user.getId(), jwtProperties.getTokenTTL());
        // 6.封装VO返回
        UserLoginVO userLoginVO = new UserLoginVO();
        userLoginVO.setUserId(user.getId());
        userLoginVO.setUsername(user.getUsername());
        userLoginVO.setToken("token");
        return userLoginVO;
    }
}
