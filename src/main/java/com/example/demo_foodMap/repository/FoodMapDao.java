package com.example.demo_foodMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_foodMap.entity.FoodMap;
@Repository
public interface FoodMapDao extends JpaRepository<FoodMap , String>{
/**
 * 
 */
	
}
