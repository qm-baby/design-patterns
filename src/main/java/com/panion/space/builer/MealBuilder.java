package com.panion.space.builer;

/**
 * @ClassName MealBuilder
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 10:54
 * @Version 1.0
 */
public class MealBuilder {

	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addFood(new VegBurger());
		meal.addFood(new Coke());
		return meal;
	}

	public Meal perpareNonVegMeal(){
		Meal meal = new Meal();
		meal.addFood(new ChickenBurger());
		meal.addFood(new Pepsi());
		return meal;
	}
}
