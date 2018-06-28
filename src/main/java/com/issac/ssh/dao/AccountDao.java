package com.issac.ssh.dao;

import org.springframework.stereotype.Repository;

/**
 *
 * author:  ywy
 * date:  2018-06-27
 * desc:
 *
 */
public interface AccountDao {
    /**
     *
     * @param out 转出账号
     * @param money
     */
    void outMoney(String out,Double money);

    /**
     *
     * @param in 转入账号
     * @param money
     */
    void inMoney(String in,Double money);
}