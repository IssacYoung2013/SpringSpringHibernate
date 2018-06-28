package com.issac.ssh.service.Impl;

import com.issac.ssh.dao.AccountDao;
import com.issac.ssh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;



/**
 * author:  ywy
 * date:  2018-06-27
 * desc:
 */
@Service("accountService")
@Transactional(propagation = Propagation.REQUIRED,noRollbackFor = ArithmeticException.class)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * @param out
     * @param in
     * @param money
     */
    @Override
    public void transfer(final String out, final String in, final Double money) {
        accountDao.outMoney(out, money);
        int i = 1 /0 ;
        accountDao.inMoney(in, money);
    }
}