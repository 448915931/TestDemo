package com.tqf.test.service;

import com.tqf.test.ov.TestExtend2;
import org.springframework.stereotype.Service;

@Service
public class TestExtendcxServceImpl extends TestExtend2 {

    public void test2(){
        System.out.println("我是测试2");
    }
    @Override
    public void testextendabstract(){
        System.out.println("重写抽象方法");
    }
}
