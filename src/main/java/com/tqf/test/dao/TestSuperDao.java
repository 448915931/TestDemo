package com.tqf.test.dao;

/**
 * Created by Tang-QiFeng on 2019/4/29
 */
public class TestSuperDao extends TestSuperExtend{

    //使用这种方法调用父类的构造方法，该类上不能使用注解，不然会报错！！！
    public TestSuperDao(String test) {
        super(test);
    }
}
