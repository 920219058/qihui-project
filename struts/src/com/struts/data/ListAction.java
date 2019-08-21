package com.struts.data;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.dao.User;

public class ListAction extends ActionSupport {
	// 封装数据到list集合
	private List<User> list;

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	@Override
	public String execute() {
		System.out.println("ListAction........" + list);
		return NONE;
	}

}
