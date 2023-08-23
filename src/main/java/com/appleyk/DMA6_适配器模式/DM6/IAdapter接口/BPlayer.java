package com.appleyk.DMA6_适配器模式.DM6.IAdapter接口;

/**
 * <p>播放器B  == 只具有播放MV的功能</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 2018年11月10日 - 下午1:20:15
 * @Version V.1.0.1
 */
public class BPlayer extends AbstractPlayer{

	/**
	 * 重写父类方法
	 */
	@Override
	public void playMVs() {
		System.out.println("B实现播放MV的功能");
	}

	@Override
	public void show(){
		System.out.println("=====播放器B功能展示：");
		playMusics();
		playMVs();
		playMovies();
	}
}
