package com.issac.ssh.dao.Impl;

import com.issac.ssh.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * author:  ywy
 * date:  2018-06-27
 * desc:
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
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