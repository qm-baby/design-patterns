package com.panion.space.singleton;

/**
 * @ClassName Singleton2
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 9:26
 * @Version 1.0
 */
public class Singleton2 {

	/**
	 * 懒汉式，线程安全
	 * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
	 * 优点：第一次调用才初始化，避免内存浪费。
	 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
	 * getSingleton2() 的性能对应用程序不是很关键（该方法使用不太频繁）。
	 */

	private static Singleton2 singleton2;

	private Singleton2(){

	}

	public static synchronized Singleton2 getSingleton2(){
		if(singleton2 == null){
			singleton2 = new Singleton2();
		}
		return singleton2;
	}
}
