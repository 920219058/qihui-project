package com.struts.ognl;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class ContextAction extends ActionSupport {
	@Override
	public String execute() {
		System.out.println("ContextAction.............");
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("req", "reqValue");
		return "success";
	}
}
