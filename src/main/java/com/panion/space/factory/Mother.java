package com.panion.space.factory;

/**
 * @ClassName Mother
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/2415:46
 * @Version 1.0
 */
public class Mother implements Work{

	@Override
	public void findWork() {
		System.out.println("妈妈在朋友的推荐下找到了一份早九晚五的工作！");
	}
}
