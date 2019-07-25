package com.panion.space.builer;

/**
 * @ClassName VegBurger
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 10:40
 * @Version 1.0
 */
public class VegBurger extends Burger {
	@Override
	public String name() {
		return "veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}
}
