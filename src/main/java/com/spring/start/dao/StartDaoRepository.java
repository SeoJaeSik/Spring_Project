package com.spring.start.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StartDaoRepository implements StartDao {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public void getDB() {
        System.out.println("Dao Execute !");
        String time = sqlSession.selectOne("start.get_time");
        System.out.println(time);
    }
}
