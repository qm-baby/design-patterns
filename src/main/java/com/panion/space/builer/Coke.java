package com.panion.space.builer;

/**
 * @ClassName Coke
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 10:47
 * @Version 1.0
 */
public class Coke extends ColdDrink {
	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}
}
