package com.tqf.test.service;

import com.tqf.test.ov.TestExtend1;
import org.springframework.stereotype.Service;

@Service
public class TestExtendServiceImpl extends TestExtend1 {

    public void test(){
        System.out.println("我是测试111");
    }

    @Override
    public void testextendpublic(){
        System.out.println("重写继承方法");
    }
}
