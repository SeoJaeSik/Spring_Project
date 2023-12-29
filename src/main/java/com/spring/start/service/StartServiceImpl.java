package com.spring.start.service;

import com.spring.start.dao.StartDao;
import com.spring.start.dao.StartDaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StartServiceImpl implements StartService {

    @Autowired
    private StartDao dao;

    @Override
    public void getDB() {
        System.out.println("Service Execute !");
        dao.getDB();

    }

}
