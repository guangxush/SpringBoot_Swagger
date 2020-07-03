package com.shgx.swagger.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author: guangxush
 * @create: 2020/07/03
 */
@Data
@Builder
public class Student {

    @ApiModelProperty(value = "defaultStr", required = true)
    private String uid;
    @ApiModelProperty(value = "defaultStr", example = "Tom")
    private String name;
    @ApiModelProperty(value = "defaultStr", example = "123456")
    private String password;
}
