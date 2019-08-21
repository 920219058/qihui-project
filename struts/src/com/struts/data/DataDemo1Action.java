package com.struts.data;

import com.opensymphony.xwork2.ActionSupport;

public class DataDemo1Action extends ActionSupport {
	/**
	 * 属性封装获取表单数据
	 */
	private String username;
	private String password;
	private String address;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String execute() {
		System.out.println("DataDemo1Action...............");
		System.out.println(username + ":" + password + ":" + address);
		return NONE;
	}

}
