package com.struts.cation;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.dao.User;

public class ListDemoAction extends ActionSupport {

	private List<User> list = new ArrayList<User>();

	public List<User> getList() {
		return list;
	}

	private String testString = "";

	public String getTestString() {
		return testString;
	}

	@Override
	public String execute() {
		User user1 = new User("wuqihui", "66666", "guangxi");
		User user2 = new User("wuqiquan", "99999", "guangxi");
		list.add(user1);
		list.add(user2);
		testString = "this is Test";
		return "success";
	}
}
