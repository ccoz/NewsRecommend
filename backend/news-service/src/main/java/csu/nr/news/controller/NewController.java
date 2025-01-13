package csu.nr.news.controller;

import csu.nr.news.service.INewService;
import csu.yang.api.domain.dto.NewDTO;
import csu.yang.api.domain.vo.NewDetailVO;
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
@RequestMapping("/newss")
@RequiredArgsConstructor // Lombok annotation to generate a constructor with required arguments
public class NewController {
    private final INewService newService;

    @ApiOperation("根据id查询单条新闻接口")
    @PostMapping("login")
    public NewDetailVO login(@RequestBody @Validated NewDTO newDTO) {
        // @Validated is used to validate the request body
        return newService.FindNewDetail(newDTO);
    }
}
