package com.appleyk.DMA6_适配器模式.DM6.IAdapter接口;

/**
 * <p>播放器C == 即能播放音乐、MV、又能播放电影</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 2018年11月10日 - 下午1:20:15
 * @Version V.1.0.1
 */
public class CPlayer extends AbstractPlayer{

	/**
	 * 重写父类播放MV方法
	 */
	@Override
	public void playMVs() {
		System.out.println("C实现播放MV的功能");
	}
	

	@Override
	public void playMusics() {
		System.out.println("C实现播放音乐的功能");
	}


	@Override
	public void playMovies() {
		System.out.println("C实现播放电影的功能");
	}


	@Override
	public void show(){
		System.out.println("=====播放器C功能展示：");
		playMusics();
		playMVs();
		playMovies();
	}
}
