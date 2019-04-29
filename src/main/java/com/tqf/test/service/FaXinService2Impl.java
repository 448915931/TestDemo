package com.tqf.test.service;

import com.tqf.test.ov.FaXinExtend2;
import org.springframework.stereotype.Service;

/**
 * Created by Tang-QiFeng on 2019/4/29
 */
@Service
public class FaXinService2Impl extends FaXinExtend2 {

    public void testfanxin(){
        System.out.println( this.getClass());
        System.out.println( super.getClass());
        System.out.println( super.getClass().getName());
        super.sayhello();
    }

}
