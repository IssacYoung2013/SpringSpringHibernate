package com.issac.ssh.dao.Impl;

import com.issac.ssh.dao.AccountDao;
import com.issac.ssh.dao.MyJdbcDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * author:  ywy
 * date:  2018-06-27
 * desc:
 */
@Repository("accountDao")
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Autowired
    public AccountDaoImpl(DataSource dataSource) {
        setDataSource(dataSource);
    }

    /**
     *
     * @param out 转出账号
     * @param money
     */
    @Override
    public void outMoney(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    /**
     *
     * @param in 转入账号
     * @param money
     */
    @Override
    public void inMoney(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql, money, in);
    }
}