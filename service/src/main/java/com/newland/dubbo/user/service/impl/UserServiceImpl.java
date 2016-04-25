package com.newland.dubbo.user.service.impl;

import org.springframework.stereotype.Service;

import com.newland.dubbo.user.mode.User;
import com.newland.dubbo.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public User getUserByUserNo(String userNo) {
		User user = new User();
		user.setUserNo(userNo);
		user.setUserName(userNo+"用户名称");
		return user;
	}

}
