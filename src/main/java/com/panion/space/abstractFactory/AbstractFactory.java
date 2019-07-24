package com.panion.space.abstractFactory;

/**
 * @ClassName AbstractFactory
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/24 17:08
 * @Version 1.0
 */
public abstract class AbstractFactory {

	public abstract Car getMyCar(String car);

	public abstract Work findWork(String people);
}
