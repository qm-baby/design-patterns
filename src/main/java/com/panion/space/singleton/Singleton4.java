package com.panion.space.singleton;

/**
 * @ClassName Singleton4
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 9:31
 * @Version 1.0
 */
public class Singleton4 {
	//
	/**
	 * 双检索、双重校验锁
	 * 简介：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
	 * getSingleton4() 的性能对应用程序很关键。
	 */

	private volatile static Singleton4 singleton4;

	private Singleton4(){}
	public static Singleton4 getSingleton4(){
		if(singleton4 == null){
			synchronized (Singleton4.class){
				if(singleton4 == null){
					singleton4 = new Singleton4();
				}
			}
		}
		return singleton4;
	}
}
