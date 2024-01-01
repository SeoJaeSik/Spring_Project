package com.spring.start.dao;

import com.spring.start.mapper.StartMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StartDaoRepository implements StartDao {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    private StartMapper mapper;

    @Override
    public void get_time() {
        System.out.println("Dao Execute !");

        String time = mapper.getTime();
        System.out.println(time);

        StartMapper startMapper = sqlSessionTemplate.getMapper(StartMapper.class);
        String time2 = startMapper.getTime();
        System.out.println(time2);
    }
}
