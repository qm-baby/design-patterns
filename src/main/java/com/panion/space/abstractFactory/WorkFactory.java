package com.panion.space.abstractFactory;

/**
 * @ClassName WorkFactory
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/24 17:10
 * @Version 1.0
 */
public class WorkFactory extends AbstractFactory {
	@Override
	public Car getMyCar(String car) {

		return null;
	}

	@Override
	public Work findWork(String people) {
		if(null == people){
			return null;
		}
		if(people.equalsIgnoreCase("father")){
			return new Father();
		}else if("mother".equalsIgnoreCase(people)){
			return new Mother();
		}else if("son".equalsIgnoreCase(people)){
			return new Son();
		}
		return null;
	}
}
