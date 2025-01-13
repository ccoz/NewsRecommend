package csu.yang.api.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel(description = "新闻信息")
public class NewDTO {
    @ApiModelProperty(value = "新闻id")
    private Long id;
    @ApiModelProperty(value = "新闻分类")
    private String category;
    @ApiModelProperty(value = "新闻标题")
    private String title;
    @ApiModelProperty(value = "新闻内容")
    private String content;
}
