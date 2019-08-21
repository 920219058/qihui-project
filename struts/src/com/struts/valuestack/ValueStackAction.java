package com.struts.valuestack;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.dao.User;

public class ValueStackAction extends ActionSupport {
	private String userName;

	public String getUserName() {
		return userName;
	}

	private User user = new User();

	public User getUser() {
		return user;
	}

	private List<User> userList = new ArrayList<User>();

	public List<User> getUserList() {
		return userList;
	}

	@Override
	public String execute() {
		// User user = new User("wuqihui", "wuqihui666", "广西贵港平南");
		// 获取对象
		user.setUsername("wuqihui");
		user.setPassword("666666");
		user.setAddress("广西贵港平南");

		User user1 = new User();
		user1.setUsername("yangxiulan");
		user1.setPassword("666666");
		user1.setAddress("广西贵港平南");

		User user2 = new User();
		user2.setUsername("wuzhihua");
		user2.setPassword("88888");
		user2.setAddress("广西贵港平南");

		userList.add(user1);
		userList.add(user2);

		// 获取字符串
		userName = "wuqihui";
		return "success";
	}

}
