package csu.nr.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import csu.nr.api.domain.dto.LoginFormDTO;
import csu.nr.api.domain.po.User;
import csu.nr.api.domain.vo.UserLoginVO;

public interface IUserService extends IService<User> {
    //    List<ItemDTO> queryItemByIds(Collection<Long> ids);
    UserLoginVO login(LoginFormDTO loginFormDTO);
}
