package com.struts.from1DemoAction;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Form2DemoAction extends ActionSupport {

	private static final long serialVersionUID = 2713059174294943473L;

	@Override
	public String execute() {
		System.out.println("Form2DemoAction........");
		// 使用ServletActionContext类获取
		HttpServletRequest request = ServletActionContext.getRequest();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		System.out.println(userName + ":" + password + ":" + address);

		// 操作三个域对象
		// request域
		HttpServletRequest request2 = ServletActionContext.getRequest();
		request2.setAttribute("req", "reqValue");
		// session 域
		HttpSession session = request2.getSession();
		session.setAttribute("sess", "sessValue");

		// ServletContext 域
		ServletContext context = ServletActionContext.getServletContext();
		context.setAttribute("contextname", "contextValue");
		return NONE;
	}
}
