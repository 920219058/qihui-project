package com.struts.cation;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class UserAction extends ActionSupport {
	@Override
	public String execute() {
		// 获取ActionContest类的对象
		ActionContext context = ActionContext.getContext();
		// 调用方法得到值栈对象
		ValueStack stack1 = context.getValueStack();
		ValueStack stack2 = context.getValueStack();
		System.out.println(stack1 == stack2);
		return NONE;
	}
}
