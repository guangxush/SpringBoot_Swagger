package com.shgx.swagger.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * 成绩查询
 *
 * @author: guangxush
 * @create: 2020/07/04
 */
@Data
@Builder
public class Score {
    @ApiModelProperty(required = true)
    private Long courseId;
    @ApiModelProperty(required = true)
    private Long uid;
    @ApiModelProperty(value = "0L")
    private Integer score;
}
