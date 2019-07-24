package com.panion.space.factory;

/**
 * @ClassName HomeFacory
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/24 15:45
 * @Version 1.0
 */
public class HomeFacory {

	public Work getFindWork(String people) {
		if (null == people) {
			return null;
		}
		if (people.equalsIgnoreCase("father")) {
			return new Father();
		} else if ("mother".equalsIgnoreCase(people)) {
			return new Mother();
		} else if ("son".equalsIgnoreCase(people)) {
			return new Son();
		}
		return null;
	}
}
