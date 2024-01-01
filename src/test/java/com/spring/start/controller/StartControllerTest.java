package com.spring.start.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.DriverManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class StartControllerTest {

    @Test
    public void Altibase_DB연결확인() {
        try {
            Class.forName("Altibase5.jdbc.driver.AltibaseDriver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:Altibase://nexgrid2.iptime.org:40300/mydb",
                    "",
                    "");

            System.out.println(conn);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Oracle_DB연결확인_Home() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "mymvc_user",
                    "gclass");

            System.out.println(conn);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}