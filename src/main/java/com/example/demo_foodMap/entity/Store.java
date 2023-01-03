package com.example.demo_foodMap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "store")
@IdClass(value =StoreFoodNameId.class)
public class Store {

	@Id
	@Column(name = "store_name")
	private String storeName ;
	
	@Id
	@Column(name ="food_name")
	private String foodName ;
	
	@Column(name = "price")
	private Integer price ;
	
	@Column(name ="food_level")
	private double foodLevel ;
	
	public Store () {
		
	}
	//快速的new出一個object 然後帶入我的參數
	public Store (String storeName,String foodName,Integer price, double foodLevel) {
	this.storeName = storeName;
	this.foodName = foodName;
	this.price = price;
	this.foodLevel = foodLevel;
	}
	
	public Store(String storeName , String foodName) {
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
	
}
