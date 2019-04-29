package com.tqf.test.ov;

public class TestExtend1 implements TestInterface{

    //继承的方法必须是公共，受保护的也不行
    @Override
    public void testextendpublic(){
        System.out.println("我是继承testextendpublic");
    }

}
