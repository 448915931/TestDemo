package com.tqf.test.controller;

import com.tqf.test.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestServiceImpl testService;
    /**
     *      解析String xml
     *      http://localhost:8080/testdemo/Stringapi
     * @return
     */
    @RequestMapping("/Stringapi")
    public String Stringapi(){
//        testService.testservice();
        testService.testjx();
        return "11";
    }
    /**
     *      解析xml文件
     *      http://localhost:8080/testdemo/fileapi
     * @return
     */
    @RequestMapping("/fileapi")
    public String fileapi(){
        testService.fileservice();
        return "22";
    }
    /**
     *      生成 xml到控制台
     *      http://localhost:8080/testdemo/createxml
     * @return
     */
    @RequestMapping("/createxml")
    public String createxml(){
        testService.createxml();
        return "22";
    }
}
