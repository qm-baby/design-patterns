package com.panion.space.singleton;

/**
 * @ClassName SingletonDemo
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 9:17
 * @Version 1.0
 */
public class SingletonDemo {

	public static void main(String[] args) {
		// 不合法的构造函数
		// 编译时错误：构造函数Singleton()是不可见的
		// Singleton singleton = new Singleton();

		// 获取唯一可用的对象
		Singleton singleton = Singleton.getInstance();

		singleton.showMessage();
	}
}
