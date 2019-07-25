package com.panion.space.builer;

/**
 * @ClassName ColdDrink
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 10:24
 * @Version 1.0
 */
public abstract class ColdDrink implements Food {
	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
