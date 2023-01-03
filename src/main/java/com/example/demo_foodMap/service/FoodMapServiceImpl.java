package com.example.demo_foodMap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo_foodMap.constants.foodMapRtnCode;
import com.example.demo_foodMap.entity.FoodMap;
import com.example.demo_foodMap.entity.Store;
import com.example.demo_foodMap.entity.StoreFoodNameId;
import com.example.demo_foodMap.repository.FoodMapDao;
import com.example.demo_foodMap.repository.StoreDao;
import com.example.demo_foodMap.vo.FoodMapRes;

@Service
public class FoodMapServiceImpl implements FoodMapService {

	@Autowired
	private FoodMapDao foodMapDao;
	@Autowired
	private StoreDao storeDao;

	// 檢驗storeName& foodName
	private FoodMapRes checkStoreFoodname(String storeName, String foodName) {
		if (!StringUtils.hasText(storeName) || !StringUtils.hasText(foodName)) {
			return new FoodMapRes(new Store(), foodMapRtnCode.CREAT_REQIRED.getMessage());
		}
		return null;

	}

	private FoodMapRes checkPriceFoodlevel(Integer price, double foodLevel) {
		if (price == null || price < 1 || foodLevel < 1 || foodLevel > 5) {
			return new FoodMapRes(new Store(), foodMapRtnCode.CREAT_REQIRED.getMessage());
		}
		return null;

	}

	private FoodMapRes checkMapStore(String city, String storeName) {
		if (!StringUtils.hasText(city) || !StringUtils.hasText(storeName)) {
			return new FoodMapRes(new FoodMap(), foodMapRtnCode.CREAT_REQIRED.getMessage());
		}
		return null;

	}

	@Override
	/* 1. 建立美食地圖()店名&地區 */
	public FoodMapRes creatMapInfo(String city, String storeName) {

		FoodMapRes result = checkMapStore(city, storeName);
		if (result != null) {
			return result;
		}
		FoodMapRes res = new FoodMapRes();
		Optional<FoodMap> foodMapOp = foodMapDao.findById(storeName);
		if (foodMapOp.isPresent()) {
			res.setMessage("店家已存在");
			return res;
		}

		FoodMap foodMap = new FoodMap(city, storeName);
		foodMapDao.save(foodMap);
		res.setMessage(" 新增地點 : " + city + " 店家 : " + storeName + " 成功! ");

		return res;
	}

	@Override
	/* 2. 建立餐點 */
	public FoodMapRes creatStoreInfo(String storeName, String foodName, Integer price, double foodLevel) {

		/* 判斷輸入格式是否正確 */
		FoodMapRes result = checkStoreFoodname(storeName, foodName);
		if (result != null) {
			return result;
		}

		FoodMapRes result1 = checkPriceFoodlevel(price, foodLevel);
		if (result1 != null) {
			return result1;
		}

		FoodMapRes res = new FoodMapRes();
		Optional<FoodMap> foodMapOp = foodMapDao.findById(storeName);
		if (!foodMapOp.isPresent()) {
			res.setMessage("此店家尚未設定，需先輸入店家");
			return res;
		}
		StoreFoodNameId storeFoodNameId = new StoreFoodNameId(storeName, foodName);
		Optional<Store> checkStoreFoodIdOp = storeDao.findById(storeFoodNameId);
		if (checkStoreFoodIdOp.isPresent()) {
			res.setMessage("此商家餐點資訊已經存在");
			return res;
		}

		int totalStoreLevel = 0;
		int count = 0;
		List<Store> storeList = storeDao.findAllByStoreName(storeName);
		for (Store item : storeList) {

			totalStoreLevel += item.getFoodLevel();
			count++;
		}
		double storeLevel = (totalStoreLevel / count) * 10.0 / 10.0;

		FoodMap foodMap = new FoodMap(storeName, storeLevel);

		foodMapDao.save(foodMap);
		Store store = new Store(storeName, foodName, price, foodLevel);
		storeDao.save(store);
		res.setMessage(" 存入店家 : " + storeName + " 餐點 : " + storeName + " 成功! ");

		return res;
	}

	@Override
	// 更新菜單的價錢跟評分
	public FoodMapRes renewStoreInfo(String storeName, String foodName, Integer price, double foodLevel) {

		FoodMapRes result = checkStoreFoodname(storeName, foodName);
		if (result != null) {
			return result;
		}
		FoodMapRes result1 = checkPriceFoodlevel(price, foodLevel);
		if (result1 != null) {
			return result1;
		}
		FoodMapRes res = new FoodMapRes();
		StoreFoodNameId storeFoodNameId = new StoreFoodNameId(storeName, foodName);
		Optional<Store> checkStoreFoodIdOp = storeDao.findById(storeFoodNameId);
		if (!checkStoreFoodIdOp.isPresent()) {
			res.setMessage("查無此店家資訊");
			return res;
		}
		Store store = new Store(storeName, foodName, price, foodLevel);
		storeDao.save(store);
		res.setMessage(" 更改店家 : " + storeName + " 餐點 : " + storeName + " 成功! ");

		return res;

	}

	@Override
	public FoodMapRes renewMapInfo(String city, String storeName) {
		// 修改美食地圖

		return null;
	}

}
