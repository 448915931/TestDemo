package com.tqf.test.ov;

public abstract class TestExtend2 implements TestInterface{

    public void testextendabstract(){
        System.out.println("我是抽象类");
    }

    @Override
    public void testextendpublic(){
        System.out.println("我是实现接口了");
    }
}
