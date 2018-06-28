package com.issac.ssh.service;

import org.springframework.stereotype.Service;

/**
 *  转账案例的业务接口
 * author:  ywy
 * date:  2018-06-27
 * desc:
 *
 */
public interface AccountService {

    public void transfer(String out,String in,Double money);
}