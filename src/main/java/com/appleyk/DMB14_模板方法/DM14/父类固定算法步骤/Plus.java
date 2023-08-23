package com.appleyk.DMB14_模板方法.DM14.父类固定算法步骤;

/**
 * <p>加法运算</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class Plus extends AbstractCalculator{


    @Override
    protected double calculate(double numA, double numB) {
        return numA + numB ;
    }


    /**
     * 重写父类钩子方法
     */
    @Override
    public void hookSay() {
        System.out.println("子类Plus说：接下来，由我来计算结果！");
    }

}
