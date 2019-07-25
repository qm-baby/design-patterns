package com.panion.space.builer;

/**
 * @ClassName Burger
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 10:22
 * @Version 1.0
 */
public abstract class Burger implements Food {
	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
