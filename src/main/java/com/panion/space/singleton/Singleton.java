package com.panion.space.singleton;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 9:11
 * @Version 1.0
 */
public class Singleton {

	// 创建Singleton 的一个对象
	private static Singleton singleton = new Singleton();

	// 让构造函数设置为private，这样该类就不会实例化
	private Singleton(){}

	// 获取唯一可用的对象
	public static Singleton getInstance(){
		return singleton;
	}

	public void showMessage(){
		System.out.println("hello world!");
	}
}
