package com.appleyk.DMB15_观察者模式.DM15.RSS消息订阅;

/**
 * <p>消息订阅接口，提供一个订阅消息内容的实现</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public interface IRss {

    /**
     * <p>消息订阅，主要输出订阅的内容</p>
     */
    void rss(String content);

}
