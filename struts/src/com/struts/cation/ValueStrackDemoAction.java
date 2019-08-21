package com.struts.cation;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueStrackDemoAction extends ActionSupport {
	@Override
	public String execute() {
		System.out.println("ValueStrackDemoAction.......");
		// 获取栈值对象
		ActionContext context = ActionContext.getContext();
		ValueStack stack = context.getValueStack();

		// 调用set方法
		stack.set("itcast", "wuqihui_set");
		// 调用方法push方法
		stack.push("wuqihui");
		return "success";
	}
}
