package com.appleyk.DMB13_策略模式.DM13.商场打折;

import java.util.Random;

/**
 * <p>天猫双11购物狂欢节 -- 满500减少166，满1000元随机打折，有可能免单哦</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class Shuang11 implements ICalculatePrice{

    // 分别是免单、6.5折、7.5折、8.5折和9折
    private static double[] discount = new double[]{0.0,0.65,0.75,0.85,0.90};

    @Override
    public double getDiscountedPrice(double totalPrice) {

        if(totalPrice >= 500 && totalPrice < 1000){
            return totalPrice - 166 ;
        }

        if(totalPrice >= 1000){
            Random random = new Random();
            return totalPrice * (discount[random.nextInt(5)]);
        }
        return 0;
    }

}
