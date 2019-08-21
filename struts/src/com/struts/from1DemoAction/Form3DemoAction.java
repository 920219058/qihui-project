package com.struts.from1DemoAction;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class Form3DemoAction extends ActionSupport implements ServletRequestAware {

	private static final long serialVersionUID = 2713059174294943473L;
	private HttpServletRequest request;

	@Override
	public String execute() {
		System.out.println("Form2DemoAction........");
		// 不常使用
		HttpServletRequest request = ServletActionContext.getRequest();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		System.out.println(userName + ":" + password + ":" + address);
		return NONE;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
}
