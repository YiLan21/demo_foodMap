package com.example.demo_foodMap.service;

import java.util.List;

import com.example.demo_foodMap.entity.Store;
import com.example.demo_foodMap.vo.FoodMapRes;

public interface FoodMapService {

	public FoodMapRes creatStoreInfo(String storeName,String foodName,Integer price,double foodLevel);
	// �إ��\�I 
	
	public FoodMapRes renewStoreInfo(String storeName,String foodName,Integer price,double foodLevel);
	//�ק��\�I���� ���� 
	
	public FoodMapRes creatMapInfo (String city,String storeName);
	//�إ߬����a��()���W&�a��
	
	public FoodMapRes renewMapInfo(String city,String storeName);
	//�ק�����a��
	
	
	
	
}
