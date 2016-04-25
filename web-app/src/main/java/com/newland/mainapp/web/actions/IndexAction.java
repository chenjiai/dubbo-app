package com.newland.mainapp.web.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.newland.web.BaseAction;

@Namespace("/")
@Action("index")
@Results({ @Result(name = "success", type="dispatcher", location = "/WEB-INF/secure/index.jsp") })
public class IndexAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String execute() throws Exception {
		return SUCCESS;
	}
}
