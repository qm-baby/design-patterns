package com.panion.space.singleton;

/**
 * @ClassName Singleton3
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 9:29
 * @Version 1.0
 */
public class Singleton3 {
	//

	/**
	 * 饿汉式
	 * 简介：这种方式比较常用，但容易产生垃圾对象。
	 * 优点：没有加锁，执行效率会提高。
	 * 缺点：类加载时就初始化，浪费内存。
	 * 它基于 classloader 机制避免了多线程的同步问题，不过，singleton3 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getSingleton3 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 singleton3 显然没有达到 lazy loading 的效果。
	 */
	private static Singleton3 singleton3 = new Singleton3();

	private Singleton3(){}
	public static Singleton3 getSingleton3(){
		return singleton3;
	}
}
