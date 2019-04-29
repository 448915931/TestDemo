package com.tqf.test;

import com.tqf.test.dao.TestSuperDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public TestSuperDao testSuperDao(){
        TestSuperDao testSuperDao=new TestSuperDao("使用bean注入测试super");
        return testSuperDao;
    }

}
