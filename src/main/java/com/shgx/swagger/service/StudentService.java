package com.shgx.swagger.service;

import com.shgx.swagger.model.Student;

import java.util.List;

/**
 * @author: guangxush
 * @create: 2020/07/03
 */
public interface StudentService {
    /**
     * 登录
     *
     * @param uid
     * @param password
     * @return
     */
    Student login(Long uid, String password);

    /**
     * 查询所有学生
     * @return
     */
    List<Student> queryAll();
}
