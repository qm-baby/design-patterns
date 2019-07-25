package com.panion.space.builer;

/**
 * @ClassName ChickenBurger
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 10:45
 * @Version 1.0
 */
public class ChickenBurger extends Burger {
	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.0f;
	}
}
