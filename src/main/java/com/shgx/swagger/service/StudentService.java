package com.shgx.swagger.service;

import com.shgx.swagger.model.Student;

import java.util.List;
import java.util.Map;

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

    /**
     * 批量删除学生
     * @param userIds 学生学号列表
     * @return
     */
    Map<Long, Boolean> deleteAll(List<Long> userIds);
}
