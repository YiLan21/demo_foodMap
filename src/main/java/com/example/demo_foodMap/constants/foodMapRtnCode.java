package com.example.demo_foodMap.constants;

public enum foodMapRtnCode {

	SUCCESSFUL("200", "���\"), 
	DELET_REQIRED("400", "�R������"), 
	NOINFO_REQIRED("400", "�d�L����T"), 
	NAME_REQIRED("400", "already exists"), 
	LIST_IS_REQIRED("400", "LIST ERROR"), 
	FOOD_EXIST("400", "LIST ERROR"), 
	CREAT_REQIRED("400", "��J�榡���~");
	
	
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
