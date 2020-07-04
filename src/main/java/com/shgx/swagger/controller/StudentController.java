package com.shgx.swagger.controller;

import com.shgx.swagger.model.Student;
import com.shgx.swagger.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: guangxush
 * @create: 2020/07/03
 */
@Api(description = "学生接口 ")
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    /** 学生服务 */
    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "登录")
    @ApiImplicitParams({@ApiImplicitParam(name = "userId", value = "用户名", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String")})
    @PostMapping("/login")
    @ResponseBody()
    public Student login(Long userId, String password){
        return studentService.login(userId, password);
    }


    @ApiOperation(value = "查询所有学生")
    @GetMapping("/students") // restful不要使用动词，注意名次单复数，不要使用/getAllStudents
    @ResponseBody()
    public List<Student> getAllStudents(){
        return studentService.queryAll();
    }

}
