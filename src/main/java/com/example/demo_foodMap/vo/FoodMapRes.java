package com.example.demo_foodMap.vo;

import java.util.List;

import com.example.demo_foodMap.entity.FoodMap;
import com.example.demo_foodMap.entity.Store;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FoodMapRes {

//	@JsonInclude(JsonInclude.Include.NON_EMPTY)

	private String storeName;
	private String city;

	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private double storeLevel;

	private String foodName;
	private Integer price;

	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private double foodLevel;

	private String message;
	private Store messageStore;
	private FoodMap messageFoodmap;

	/* ============================================== */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private FoodMap foodMap;
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private Store store;
	/* ============================================== */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private List<FoodMap> foodMapList;
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private List<Store> storeList;

	/* ============================================== */

	public FoodMapRes() {
	}

	public FoodMapRes(String city, String storeName) {
		this.city = city;
		this.storeName = storeName;
	}

	public FoodMapRes(String storeName, String foodName, Integer price, double foodLevel) {
		this.storeName = storeName;
		this.foodName = foodName;
		this.price = price;
		this.foodLevel = foodLevel;
	}

	public FoodMapRes(FoodMap foodMap, String message) {
		this.foodMap = foodMap;
		this.message = message;
	}
	public FoodMapRes(Store store , String message) {
		this.store = store;
		this.message = message;
	}
	/* ============================================== */

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public List<FoodMap> getFoodMapList() {
		return foodMapList;
	}

	public void setFoodMapList(List<FoodMap> foodMapList) {
		this.foodMapList = foodMapList;
	}

	public List<Store> getStoreList() {
		return storeList;
	}

	public void setStoreList(List<Store> storeList) {
		this.storeList = storeList;
	}

	/* ================================================ */
	public Store getMessageStore() {
		return messageStore;
	}

	public void setMessageStore(Store messageStore) {
		this.messageStore = messageStore;
	}

	public FoodMap getMessageFoodmap() {
		return messageFoodmap;
	}

	public void setMessageFoodmap(FoodMap messageFoodmap) {
		this.messageFoodmap = messageFoodmap;
	}

}
