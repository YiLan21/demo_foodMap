package com.example.demo_foodMap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "foodmap")
public class FoodMap {

	
	
	@Id
	@Column(name = "store_name")
	private String storeName;
	@Column(name = "city")
	private String city;
	@Column(name = "store_level")
	private double storeLevel ;
	
	public FoodMap() {
		
	}
	
	public FoodMap(String storeName ,double storeLevel) {
		this.storeName =storeName;
		this.storeLevel =storeLevel;
	}
	public FoodMap(String city,String storeName) {
		this.city =city;
		this.storeName =storeName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public double getStoreLevel() {
		return storeLevel;
	}
	public void setStoreLevel(double storeLevel) {
		this.storeLevel = storeLevel;
	}
	
	
}
