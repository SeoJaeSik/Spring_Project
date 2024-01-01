package com.spring.start.service;

import com.spring.start.mapper.StartMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StartServiceImpl implements StartService {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void getDB() {
        System.out.println("Service Execute !");
        StartMapper startMapper = sqlSessionTemplate.getMapper(StartMapper.class);
        startMapper.getTime();
    }

}
