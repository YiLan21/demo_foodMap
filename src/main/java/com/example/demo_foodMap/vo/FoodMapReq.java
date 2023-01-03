package com.example.demo_foodMap.vo;

import com.example.demo_foodMap.entity.FoodMap;
import com.example.demo_foodMap.entity.Store;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FoodMapReq {
	
	@JsonProperty("storename")
	private String storeName;
	@JsonProperty("city")
	private String city;
	@JsonProperty("storelevel")
	private double storeLevel;
	@JsonProperty("foodname")
	private String foodName;
	@JsonProperty("price")
	private Integer price;
	@JsonProperty("foodLevel")
	private double foodLevel;
	
	private FoodMap foodMap;

	private Store store;

	/* ======================================= */
	public FoodMapReq() {

	}
	/* ======================================= */

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getStoreLevel() {
		return storeLevel;
	}

	public void setStoreLevel(double storeLevel) {
		this.storeLevel = storeLevel;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public double getFoodLevel() {
		return foodLevel;
	}

	public void setFoodLevel(double foodLevel) {
		this.foodLevel = foodLevel;
	}

	public FoodMap getFoodMap() {
		return foodMap;
	}

	public void setFoodMap(FoodMap foodMap) {
		this.foodMap = foodMap;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

}
