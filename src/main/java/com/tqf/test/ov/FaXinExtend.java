package com.tqf.test.ov;

import com.tqf.test.domain.TestDomain;

/**
 * Created by Tang-QiFeng on 2019/4/29
 */
public class FaXinExtend implements FagXinInterface<TestDomain>{

    @Override
    public TestDomain getdomain() {
        TestDomain testDomain=new TestDomain();
        testDomain.setSex("男");
        testDomain.setUsername("唐祺峰");
        testDomain.setVersion("v-111");
        return testDomain;
    }

    @Override
    public void sayhello() {
        System.out.println("say Hello");
    }
}
