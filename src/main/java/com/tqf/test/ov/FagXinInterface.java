package com.tqf.test.ov;

import com.tqf.test.domain.FaXinExtendDomain;

/**
 *  泛型对象必须继承FaXinExtendDomain ,并且接口又继承了FagXinExtendInterface接口
 *
 * Created by Tang-QiFeng on 2019/4/29
 */
public interface FagXinInterface<T extends FaXinExtendDomain> extends FagXinExtendInterface{
    T getdomain();
}
