package com.panion.space.abstractFactory;

/**
 * @ClassName FactoryTest
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/24 17:19
 * @Version 1.0
 */
public class FactoryTest {

	public static AbstractFactory getFactory(String factory) {
		if (factory.equalsIgnoreCase("work")) {
			return new WorkFactory();
		} else if (factory.equalsIgnoreCase("car")) {
			return new CarFactory();
		}
		return null;
	}
}
