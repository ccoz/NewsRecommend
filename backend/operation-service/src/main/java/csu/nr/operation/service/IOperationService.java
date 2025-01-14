package csu.nr.operation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import csu.nr.api.domain.dto.UserActionNewDTO;
import csu.nr.api.domain.po.Operation;
import csu.nr.api.domain.vo.UserActionNewVO;

public interface IOperationService extends IService<Operation> {
    UserActionNewVO getOperationById(UserActionNewDTO userActionNewDTO);
}
