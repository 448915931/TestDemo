package com.tqf.test.controller;


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
        return "测试";
    }
}
