package com.example.demo_foodMap.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StoreFoodNameId implements Serializable {

	private String storeName;

	private String foodName;

	public StoreFoodNameId() {

	}

	public StoreFoodNameId(String storeName, String foodName) {
		this.storeName = storeName;
		this.foodName = foodName;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

}
