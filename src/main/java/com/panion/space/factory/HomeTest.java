package com.panion.space.factory;

/**
 * @ClassName HomeTest
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/24 15:57
 * @Version 1.0
 */
public class HomeTest {

	/**
	 * 通过工厂 进行通知
	 * 一个接口类用来实现
	 * father类实现work接口在用家庭工厂告诉大家自己找到的工作
	 * mother类实现work接口在用家庭工厂告诉大家自己找到的工作
	 * son类实现work接口在用家庭工厂告诉大家自己找的工作
	 */
	public static void main(String[] args) {
		HomeFacory facory = new HomeFacory();
		Work work = facory.getFindWork("father");
		work.findWork();

		Work work1 = facory.getFindWork("mother");
		work1.findWork();

		Work work2 = facory.getFindWork("son");
		work2.findWork();
	}
}
