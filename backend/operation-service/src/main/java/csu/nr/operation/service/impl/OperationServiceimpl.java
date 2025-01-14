package csu.nr.operation.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import csu.nr.operation.mapper.OperationMapper;
import csu.nr.operation.service.IOperationService;
import csu.nr.api.client.NewClient;
import csu.nr.api.domain.dto.NewDTO;
import csu.nr.api.domain.dto.UserActionNewDTO;
import csu.nr.api.domain.po.Operation;
import csu.nr.api.domain.vo.UserActionNewVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationServiceimpl extends ServiceImpl<OperationMapper, Operation> implements IOperationService {

    private final NewClient newClient;

    @Override
    public UserActionNewVO getOperationById(UserActionNewDTO userActionNewDTO) {
        // 1.获取用户id和新闻id
        Long userId = userActionNewDTO.getUserId();
        Long newId = userActionNewDTO.getNewId();
        // 2.根据用户id查找所有记录
        List<Operation> operationList = lambdaQuery().eq(Operation::getUserId, userId).list();
        List<Integer> actionList = new ArrayList<Integer>();
        int value = 0;
        for (Operation operation : operationList) {
            actionList.add(operation.getOperationType());
            value += operation.getOperationType();
        }
        // 3.根据新闻id查找记录
        NewDTO newDTO = newClient.queryNewById(newId);
        // 4.封装VO返回
        UserActionNewVO userActionNewVO = new UserActionNewVO();
        userActionNewVO.setUserId(userId);
        userActionNewVO.setNewDTO(newDTO);
        userActionNewVO.setActionList(actionList);
        userActionNewVO.setValue(Integer.valueOf(value));
        return userActionNewVO;
    }
}
