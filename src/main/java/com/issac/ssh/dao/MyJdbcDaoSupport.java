package com.issac.ssh.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 *
 * author:  ywy
 * date:  2018-06-28
 * desc:
 *
 */
public class MyJdbcDaoSupport extends JdbcDaoSupport {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    private void initialize(){

        setDataSource(dataSource);
    }
}