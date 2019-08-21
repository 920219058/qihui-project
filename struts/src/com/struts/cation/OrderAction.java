package com.struts.cation;

import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport {
	private static final long serialVersionUID = 607920549828842770L;

	@Override
	public String execute() {
		System.out.println("OrderAction.........");
		return SUCCESS;
	}

}
