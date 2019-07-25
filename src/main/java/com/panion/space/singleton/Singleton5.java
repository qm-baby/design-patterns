package com.panion.space.singleton;

/**
 * @ClassName Singleton5
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 9:37
 * @Version 1.0
 */
public class Singleton5 {

	// 登记式，静态内部类

	/**
	 * 简介：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，
	 * 应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
	 * 这种方式同样利用了 classloader 机制来保证初始化 singleton5 时只有一个线程，
	 * 它跟第 3 种方式不同的是：第 3 种方式只要 Singleton5 类被装载了，
	 * 那么 singleton5 就会被实例化（没有达到 lazy loading 效果），
	 * 而这种方式是 Singleton5 类被装载了，singleton5 不一定被初始化。
	 * 因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，
	 * 才会显式装载 SingletonHolder 类，从而实例化 instance。
	 * 想象一下，如果实例化 singleton5 很消耗资源，所以想让它延迟加载，
	 * 另外一方面，又不希望在 Singleton5 类加载时就实例化，
	 * 因为不能确保 Singleton5 类还可能在其他的地方被主动使用从而被加载，
	 * 那么这个时候实例化 singleton5 显然是不合适的。这个时候，这种方式相比第 3 种方式就显得很合理。
	 */

	private static class SingletonHoler{
		private static final Singleton5 singleton5 = new Singleton5();
	}
	private Singleton5(){}
	public static final Singleton5 getSingleton5(){
		return SingletonHoler.singleton5;
	}
}
