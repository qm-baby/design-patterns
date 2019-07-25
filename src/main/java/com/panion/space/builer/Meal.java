package com.panion.space.builer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Meal
 * @Description TODO
 * @Author QiMing
 * @Date 2019/7/25 10:49
 * @Version 1.0
 */
public class Meal {

	private List<Food> list = new ArrayList<>();

	public void addFood(Food food){
		list.add(food);
	}

	public float getCost(){
		float cost = 0.0f;
		for(Food food : list){
			cost += food.price();
		}
		return cost;
	}

	public void showFood(){
		for(Food food : list){
			System.out.println("Food" + food.name());
			System.out.println("packing: " + food.packing().pack());
			System.out.println("price" + food.price());
		}
	}
}
