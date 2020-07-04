package com.shgx.swagger.controller;

import com.shgx.swagger.model.Score;
import com.shgx.swagger.model.Student;
import com.shgx.swagger.service.ScoreService;
import com.shgx.swagger.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: guangxush
 * @create: 2020/07/04
 */
@Api(description = "成绩查询接口")
@RestController
@RequestMapping(value = "/score")
public class ScoreController {

    /** 成绩查询服务 */
    @Autowired
    private ScoreService scoreService;

    @ApiOperation(value = "查询成绩")
    @ApiImplicitParams({@ApiImplicitParam(name = "userId", value = "学号", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "courseId", value = "课程ID", required = true, dataType = "Long")})
    @GetMapping("/query/{userId}/{courseId}")
    @ResponseBody()
    public Score login(@PathVariable Long userId,@PathVariable Long courseId){
        return scoreService.query(userId, courseId);
    }
}
