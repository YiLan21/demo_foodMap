package com.example.demo_foodMap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_foodMap.entity.Store;
import com.example.demo_foodMap.service.FoodMapService;
import com.example.demo_foodMap.vo.FoodMapReq;
import com.example.demo_foodMap.vo.FoodMapRes;

@RestController
public class FoodMapController {

	@Autowired
	private FoodMapService foodMapService;

	/*
	 * @PostMapping(value = "/api/getCompanies") 
	 * public List<Company> findAll(@RequestBody ) {
	 * return companyService.findAll();
	 */
	
	
	
	@PostMapping(value = "/api/creatStoreInfo")//�إ��\�I
	public FoodMapRes creatStoreInfo(@RequestBody FoodMapReq req) {
		
		return foodMapService.creatStoreInfo(req.getStoreName(),req.getFoodName(),req.getPrice(),req.getFoodLevel());
		
	}
	
	
	@PostMapping(value = "/api/renewStoreInfo")//�إ��\�I
	public FoodMapRes renewStoreInfo(@RequestBody FoodMapReq req) {
		
		return foodMapService.renewStoreInfo(req.getStoreName(),req.getFoodName(),req.getPrice(),req.getFoodLevel());
		
	}
	
	
	
	
	@PostMapping(value = "/api/creatMapInfo") //�إ߬����a�ϩ��a
	public FoodMapRes creatMapInfo(@RequestBody FoodMapReq req) {
		
		return foodMapService.creatMapInfo(req.getCity(), req.getStoreName());
		
	}
	
}
