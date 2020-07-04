package com.shgx.swagger.service.impl;

import com.shgx.swagger.model.Score;
import com.shgx.swagger.service.ScoreService;
import org.springframework.stereotype.Service;

/**
 * @author: guangxush
 * @create: 2020/07/04
 */
@Service
public class ScoreServiceImpl implements ScoreService {
    @Override
    public Score query(Long courseId, Long uid) {
        return Score.builder().courseId(courseId).uid(uid).score(95).build();
    }
}
