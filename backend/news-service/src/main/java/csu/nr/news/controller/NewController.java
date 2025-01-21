package csu.nr.news.controller;

import csu.nr.common.utils.BeanUtils;
import csu.nr.news.service.INewService;
import csu.nr.api.domain.dto.NewDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Api(tags = "新闻相关接口")
@RestController
@RequestMapping("/news")
@RequiredArgsConstructor // Lombok annotation to generate a constructor with required arguments
public class NewController {
    private final INewService newService;

    @ApiOperation("根据id查询新闻")
    @GetMapping("/detail/{id}")
    public NewDTO queryNewById(@PathVariable("id") Long id) {
        return BeanUtils.copyBean(newService.getById(id), NewDTO.class);
    }
}
