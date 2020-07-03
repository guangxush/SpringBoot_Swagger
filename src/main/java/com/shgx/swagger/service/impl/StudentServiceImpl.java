package com.shgx.swagger.service.impl;

import com.shgx.swagger.model.Student;
import com.shgx.swagger.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @author: guangxush
 * @create: 2020/07/03
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student query(String uid) {
        // 模拟查询db
        return new Student("123", "zhx");
    }
}