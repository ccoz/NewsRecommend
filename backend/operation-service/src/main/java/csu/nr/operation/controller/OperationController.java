package csu.nr.operation.controller;

import csu.nr.api.domain.dto.UserActionNewDTO;
import csu.nr.api.domain.vo.UserActionNewVO;
import csu.nr.common.utils.UserContext;
import csu.nr.operation.service.IOperationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户行为相关接口")
@RestController
@RequestMapping("/operation")
@RequiredArgsConstructor // Lombok annotation to generate a constructor with required arguments
public class OperationController {
    private final IOperationService operationService;

    @ApiOperation("根据id查询用户对新闻的操作")
    @PostMapping("detail")
    public UserActionNewVO getOperationById(@RequestBody @Validated UserActionNewDTO userActionNewDTO) {
        return operationService.getOperationById(userActionNewDTO);
    }

    @ApiOperation("查询当前用户对id新闻的操作")
    @GetMapping("user/{id}")
    public UserActionNewVO getOperationById(@PathVariable("id") Long id) {
        UserActionNewDTO userActionNewDTO = new UserActionNewDTO();
        Long uid = UserContext.getUser();
        userActionNewDTO.setUserId(uid);
        userActionNewDTO.setNewId(id);
        return operationService.getOperationById(userActionNewDTO);
    }
}
