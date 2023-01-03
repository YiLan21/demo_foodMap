package com.example.demo_foodMap.constants;

public enum foodMapRtnCode {

	SUCCESSFUL("200", "成功"), 
	DELET_REQIRED("400", "刪除失敗"), 
	NOINFO_REQIRED("400", "查無此資訊"), 
	NAME_REQIRED("400", "already exists"), 
	LIST_IS_REQIRED("400", "LIST ERROR"), 
	FOOD_EXIST("400", "LIST ERROR"), 
	CREAT_REQIRED("400", "輸入格式錯誤");
	
	
	private String code;
	private String message;
	private foodMapRtnCode(String code,String message) {
		
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
