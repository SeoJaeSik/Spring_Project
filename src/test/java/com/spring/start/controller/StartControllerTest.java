package com.spring.start.controller;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.Assert.*;

public class StartControllerTest {

    @Test
    public void Altibase_DB연결확인() {
        try {
            Class.forName("Altibase5.jdbc.driver.AltibaseDriver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:Altibase://nexgrid2.iptime.org:40300/mydb",
                    "das_mt",
                    "usr_mt_0529");

            System.out.println(conn);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Oracle_DB연결확인() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//nexgrid2.iptime.org:11521/ORCL",
                    "dasmaster",
                    "dpfwlxla00!");

            System.out.println(conn);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}