package com.appleyk.DMA10_桥接模式.DM10.paint.color;

/**
 * <p>绿色</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:23 2018-11-19
 * @Version V.1.0.1
 */
public class Green implements Color{
    @Override
    public void painting(String shape) {
        System.out.println("绘制绿色的"+shape);
    }
}
