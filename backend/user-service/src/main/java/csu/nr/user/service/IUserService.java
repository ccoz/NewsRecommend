package csu.nr.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import csu.yang.api.domain.dto.LoginFormDTO;
import csu.yang.api.domain.po.User;
import csu.yang.api.domain.vo.UserLoginVO;

public interface IUserService extends IService<User> {
    //    List<ItemDTO> queryItemByIds(Collection<Long> ids);
    UserLoginVO login(LoginFormDTO loginFormDTO);
}
