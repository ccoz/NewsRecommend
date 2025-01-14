package csu.nr.api.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户信息")
public class LoginFormDTO {
    @ApiModelProperty(value = "用户id")
    private Long id;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "密码")
    private String password;
}
