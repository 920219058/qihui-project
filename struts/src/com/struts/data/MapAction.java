package com.struts.data;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.dao.User;

public class MapAction extends ActionSupport {
	// 声明map集合
	private Map<String, User> map;

	public Map<String, User> getMap() {
		return map;
	}

	public void setMap(Map<String, User> map) {
		this.map = map;
	}

	@Override
	public String execute() {
		System.out.println("MapAction.........");
		System.out.println(map);
		return NONE;
	}

}
