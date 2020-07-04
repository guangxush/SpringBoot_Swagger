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
    public Student login(Long uid, String password) {
        // 模拟查询db 直接返回true
        String name = "Tom";
        return Student.builder()
                .name(name)
                .uid(uid)
                .password(password)
                .build();
    }
}
