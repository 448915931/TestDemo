package com.tqf.test.ov;

import com.tqf.test.domain.ShopDomain;
import lombok.Data;

/**
 * Created by Tang-QiFeng on 2019/4/29
 */
@Data
public class FaXinExtend2 implements FagXinInterface<ShopDomain>{



    @Override
    public ShopDomain getdomain() {
        ShopDomain shopDomain=new ShopDomain();
        shopDomain.setShopname("雨衣");
        shopDomain.setShopprice("10");
        shopDomain.setVersion("v-222222222");
        return shopDomain;
    }

    @Override
    public void sayhello() {
        System.out.println("say hello !!!");
    }
}
