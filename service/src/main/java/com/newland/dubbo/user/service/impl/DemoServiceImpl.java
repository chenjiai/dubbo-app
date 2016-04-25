package com.newland.dubbo.user.service.impl;

import com.newland.dubbo.user.service.DemoService;

public class DemoServiceImpl  implements DemoService{

	@Override
	public String hellworld(String userName) {
		return "HELLO "+userName;
	}

}
