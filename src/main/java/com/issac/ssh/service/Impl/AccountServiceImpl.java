package com.issac.ssh.service.Impl;

import com.issac.ssh.dao.AccountDao;
import com.issac.ssh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * author:  ywy
 * date:  2018-06-27
 * desc:
 */
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;


    /**
     * @param out
     * @param in
     * @param money
     */
    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        accountDao.inMoney(in, money);
    }
}