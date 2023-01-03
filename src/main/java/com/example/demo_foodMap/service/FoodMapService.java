package com.example.demo_foodMap.service;

import java.util.List;

import com.example.demo_foodMap.entity.Store;
import com.example.demo_foodMap.vo.FoodMapRes;

public interface FoodMapService {

	public FoodMapRes creatStoreInfo(String storeName,String foodName,Integer price,double foodLevel);
	// 建立餐點 
	
	public FoodMapRes renewStoreInfo(String storeName,String foodName,Integer price,double foodLevel);
	//修改餐點評價 價錢 
	
	public FoodMapRes creatMapInfo (String city,String storeName);
	//建立美食地圖()店名&地區
	
	public FoodMapRes renewMapInfo(String city,String storeName);
	//修改美食地圖
	
	
	
	
}
