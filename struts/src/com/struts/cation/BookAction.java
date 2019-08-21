package com.struts.cation;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {
	private static final long serialVersionUID = 5957191942564798902L;

	@Override
	public String execute() {
		System.out.println("bookAction........");
		return "success";
	}

}
