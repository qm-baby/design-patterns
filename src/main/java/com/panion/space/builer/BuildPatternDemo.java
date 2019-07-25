package com.panion.space.builer;

/**
 * @ClassName BuildPatternDemo
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 10:59
 * @Version 1.0
 */
public class BuildPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal meal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		meal.showFood();
		System.out.println("Total Cost:" + meal.getCost());

		Meal nonMeal = mealBuilder.perpareNonVegMeal();
		System.out.println("Non-veg Meal");

		nonMeal.showFood();
		System.out.println("Total Cost:" + nonMeal.getCost());
	}
}
