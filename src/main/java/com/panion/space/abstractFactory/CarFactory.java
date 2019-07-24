package com.panion.space.abstractFactory;

/**
 * @ClassName CarFactory
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/24 17:14
 * @Version 1.0
 */
public class CarFactory extends AbstractFactory {
	@Override
	public Car getMyCar(String car) {
		if (null == car) {
			return null;
		}
		if ("Porsche".equalsIgnoreCase(car)) {
			return new Porsche();
		} else if ("Maserati".equalsIgnoreCase(car)) {
			return new Maserati();
		} else if ("Wrangler".equalsIgnoreCase(car)) {
			return new Wrangler();
		}
		return null;
	}

	@Override
	public Work findWork(String people) {
		return null;
	}
}
