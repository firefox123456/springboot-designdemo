package com.appleyk.DMB13_策略模式.DM13.商场打折;

/**
 * <p>商品满减活动 -- 满300元减100元</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class Man300Jian100 implements ICalculatePrice{

    @Override
    public double getDiscountedPrice(double totalPrice) {

        // 全场消费满300元，减100元
        if(totalPrice >= 300){
            return totalPrice - 100 ;
        }
        return totalPrice;
    }

}
