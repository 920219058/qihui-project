package com.struts.from1DemoAction;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.dao.User;

public class Form4DemoAction extends ActionSupport {
	@Override
	public String execute() {
		// 原始获取参数方式
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		User user = new User(username, password, address);
		System.out.println(user);

		return NONE;
	}
}
