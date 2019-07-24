package com.panion.space.abstractFactory;

/**
 * @ClassName Father
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/2415:45
 * @Version 1.0
 */
public class Father implements Work {

	@Override
	public void findWork() {
		System.out.println("爸爸在整合资源后开了一家茶餐厅！");
	}
}
