package com.panion.space.abstractFactory;

/**
 * @ClassName FactoryDemo
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/24 17:23
 * @Version 1.0
 */
public class FactoryDemo {

	/**
	 * 通过指定工厂来获取所需要的业务
	 * @param args
	 */
	public static void main(String[] args) {
		// 获取工厂
		AbstractFactory abstractFactory = FactoryTest.getFactory("work");

		// 获取work 的对象
		Work work = abstractFactory.findWork("father");
		work.findWork();

		Work work1 = abstractFactory.findWork("mother");
		work1.findWork();

		Work work2 = abstractFactory.findWork("son");
		work2.findWork();

		AbstractFactory factory = FactoryTest.getFactory("car");
		Car car = factory.getMyCar("Porsche");
		car.myCar();

		Car car1 = factory.getMyCar("Maserati");
		car1.myCar();

		Car car2 = factory.getMyCar("Wrangler");
		car2.myCar();
	}
}
