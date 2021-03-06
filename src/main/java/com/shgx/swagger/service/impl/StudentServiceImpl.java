package com.shgx.swagger.service.impl;

import com.shgx.swagger.model.Student;
import com.shgx.swagger.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public List<Student> queryAll() {
        // 模拟查询
        List<Student> students = new ArrayList<>();
        students.add(Student.builder()
                .name("zhangsan")
                .uid(123L)
                .password("admin")
                .build());
        students.add(Student.builder()
                .name("lisi")
                .uid(124L)
                .password("admin")
                .build());
        students.add(Student.builder()
                .name("wangwu")
                .uid(125L)
                .password("admin")
                .build());
        return students;
    }

    @Override
    public Map<Long, Boolean> deleteAll(List<Long> userIds) {
        Map<Long, Boolean> deleteResult = new HashMap<>(userIds.size());
        for(Long uid: userIds){
            // 模拟删除成功
            deleteResult.put(uid, true);
        }
        return deleteResult;
    }


}
