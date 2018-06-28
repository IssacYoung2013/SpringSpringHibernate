package com.issac.ssh.service.Impl;

import com.issac.base.UnitTestBase;
import com.issac.ssh.service.AccountService;
import com.issac.ssh.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 *
 * author:  ywy
 * date:  2018-06-27
 * desc:
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class SpringDemo1Test extends UnitTestBase {

    @Test
    public void testDemo() {
        AccountService accountService = super.getBean("accountService");
        accountService.transfer("bbb","aaa",200d);
    }
}