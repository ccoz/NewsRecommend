package csu.nr.api.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户操作新闻")
public class UserActionNewDTO {
    @ApiModelProperty(value = "用户id")
    private Long userId;
    @ApiModelProperty(value = "新闻分类")
    private Long newId;
}
