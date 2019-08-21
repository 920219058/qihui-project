package com.struts.cation;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	private static final long serialVersionUID = 2698477292243136562L;

	/**
	 * (1) 每次访问servlet时候，都会执行service - 写类继承HttpServlet，重写类里面的方法 -
	 * 在web.xml中配置servlet访问路径
	 * 
	 * (2) 访问action，每次访问action时候，默认执行名称execte方法。 -
	 * 配置action类的访问路径（核心配置文件和路径是固定的，位置在src下，名称是struts.xml）
	 */
	@Override
	public String execute() {
		System.out.println("*********execute***********");
		return "helloActions";
	}

	public String helloString() {
		System.out.println("------helloString-------");
		return NONE;
	}

	public String add() {
		System.out.println("add........");
		return NONE;
	}

	public String del() {
		System.out.println("this is del......");
		return NONE;
	}

}
