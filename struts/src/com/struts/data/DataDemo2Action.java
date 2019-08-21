package com.struts.data;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.dao.User;

public class DataDemo2Action extends ActionSupport implements ModelDriven<User> {
	/**
	 * 使用模型驱动获取表单数据
	 */
	private User user = new User();

	@Override
	public User getModel() {
		return user;
	}

	@Override
	public String execute() {
		System.out.println("DataDemo1Action...............");
		System.out.println(user);
		return NONE;
	}
}
