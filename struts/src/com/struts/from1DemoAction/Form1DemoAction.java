package com.struts.from1DemoAction;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Form1DemoAction extends ActionSupport {

	private static final long serialVersionUID = 2713059174294943473L;

	@Override
	public String execute() {
		System.out.println("Form1DemoAction........");
		// 使用ActionContext类获取
		ActionContext context = ActionContext.getContext();
		Map<String, Object> map = context.getParameters();
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println("key is :" + key);
			Object[] obj = (Object[]) map.get(key);
			System.out.println(Arrays.toString(obj));
		}
		return NONE;
	}
}
