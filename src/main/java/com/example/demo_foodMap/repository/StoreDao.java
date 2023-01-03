package com.example.demo_foodMap.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_foodMap.entity.Store;
import com.example.demo_foodMap.entity.StoreFoodNameId;

@Repository
public interface StoreDao  extends JpaRepository<Store,StoreFoodNameId> {

	Optional<Store> findByStoreName(String storeName);

	Optional<Store> findByfoodName(String foodName);

	List<Store> findAllByStoreName(String StoreName);
	
	
	
}
