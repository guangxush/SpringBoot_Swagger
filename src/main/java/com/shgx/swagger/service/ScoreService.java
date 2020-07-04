package com.shgx.swagger.service;

import com.shgx.swagger.model.Score;

/**
 * @author: guangxush
 * @create: 2020/07/04
 */
public interface ScoreService {

    /**
     * 查询成绩
     * @param courseId
     * @param uid
     * @return
     */
    Score query(Long courseId, Long uid);

    /**
     * 修改成绩
     * @param courseId
     * @param uid
     * @return
     */
    Score update(Long courseId, Long uid);
}
