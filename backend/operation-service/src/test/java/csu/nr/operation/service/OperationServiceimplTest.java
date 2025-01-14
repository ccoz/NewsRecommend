package csu.nr.operation.service;

import csu.nr.api.domain.dto.UserActionNewDTO;
import csu.nr.api.domain.po.Operation;
import csu.nr.api.domain.vo.UserActionNewVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OperationServiceimplTest {
    @Autowired
    protected IOperationService operationService;

    @Test
    void testList() {
        UserActionNewDTO userActionNewDTO = new UserActionNewDTO();
        userActionNewDTO.setUserId(1L);
        userActionNewDTO.setNewId(1L);
        UserActionNewVO userActionNewVO = operationService.getOperation(userActionNewDTO);
    }

    @Test
    void testInsert() {
        Operation operation = new Operation();
        operation.setUserId(1L);
        operation.setNewId(1L);
        operation.setOperationType(3);
        operationService.save(operation);
    }
}
