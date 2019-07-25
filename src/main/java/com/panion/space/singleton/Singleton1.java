package com.panion.space.singleton;

/**
 * @ClassName Singleton1
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 9:23
 * @Version 1.0
 */
public class Singleton1 {

	/**
	 * 懒汉式，线程不安全
	 * 简介：
	 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
	 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
	 */

	private static Singleton1 singleton1;

	private Singleton1(){}

	public static Singleton1 getSingleton1(){
		if(singleton1 == null){
			singleton1 = new Singleton1();
		}
		return singleton1;
	}

}
