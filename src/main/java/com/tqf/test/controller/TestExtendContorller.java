package com.tqf.test.controller;


import com.tqf.test.dao.TestSuperDao;
import com.tqf.test.domain.ShopDomain;
import com.tqf.test.domain.TestDomain;
import com.tqf.test.service.FaXinService2Impl;
import com.tqf.test.service.FaXinServiceImpl;
import com.tqf.test.service.TestExtendServiceImpl;
import com.tqf.test.service.TestExtendcxServceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testextend")
public class TestExtendContorller {

    @Autowired
    private TestExtendServiceImpl testExtendService;
    @Autowired
    private TestExtendcxServceImpl testExtendcxServce;
    @Autowired
    private FaXinServiceImpl faXinService;
    @Autowired
    private FaXinService2Impl faXinService2;
    @Autowired
    private TestSuperDao testSuperDao;

    /**
     *  http://localhost:8080/testdemo/testextend/testextendapi
     * @return
     */
    @RequestMapping("/testextendapi")
    public String testextendapi(){
        testExtendService.test();
        testExtendService.testextendpublic();
        testExtendcxServce.test2();
        testExtendcxServce.testextendabstract();
        //泛型
        TestDomain testDomain=faXinService.getdomain();
        System.out.println(testDomain.getUsername()+":"+testDomain.getSex()+":"+testDomain.getVersion());
        ShopDomain shopDomain=faXinService2.getdomain();
        System.out.println(shopDomain.getShopname()+":"+shopDomain.getShopprice()+":"+shopDomain.getVersion());

        System.out.println(this.getClass());
        faXinService2.testfanxin();
        //使用创建对象去测试super调用父类的构造方法
        TestSuperDao testSuperDao2=new TestSuperDao("使用创建对象测试super");
        testSuperDao2.testsuper();
        testSuperDao.testsuper();

        return "测试";
    }
}
