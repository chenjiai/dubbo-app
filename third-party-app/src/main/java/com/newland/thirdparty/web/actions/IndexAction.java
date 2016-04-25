package com.newland.thirdparty.web.actions;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.newland.dubbo.user.mode.User;
import com.newland.dubbo.user.service.UserService;
import com.newland.web.BaseAction;

@Namespace("/")
@Action("index")
@Results({ @Result(name = "success", type="dispatcher", location = "/WEB-INF/secure/index.jsp") })
public class IndexAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Resource(name="userService")
	private UserService userService; 
	private User user;
	public String execute() throws Exception {
		user = userService.getUserByUserNo("01231");
		System.out.println("user name="+user.getUserName());
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
