package com.shgx.swagger.service;

import com.shgx.swagger.model.Student;

/**
 * @author: guangxush
 * @create: 2020/07/03
 */
public interface StudentService {
    /**
     * 根据id查询学生信息
     *
     * @param uid
     * @param password
     * @return
     */
    Student query(String uid, String password);
}
