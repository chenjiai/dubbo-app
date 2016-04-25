package com.newland.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Web应用Action基类
 * 
 * @author AsOne
 * 
 */
public class BaseAction extends ActionSupport implements SessionAware,ServletRequestAware,ServletResponseAware{
	
	public final static String SUCCESS = "success";
	public final static String INPUT = "input";
	public final static String LIST = "list";
	public final static String INDEX = "index";
	public final static String ERROR = "error";
	public final static String DETAIL = "detail";
	public final static String INFO = "info";
	public final static String GLOBAL_ERROR="globalError";
    public final static String GLOBAL_JSON_ERROR="jsonError";
	private HttpServletRequest request;
	private HttpServletResponse response;
	private Map sessionMap;
	/**
	 * 
	 */
	private static final long serialVersionUID = 3731652188707289832L;
	protected HttpServletRequest getRequest() {
        
		return this.request;
	}

	/**
	 * Convenience method to get the response
	 * 
	 * @return current response
	 */
	protected HttpServletResponse getResponse() {
		return this.response;
	}

	/**
	 * Convenience method to get the session. This will create a session if one
	 * doesn't exist.
	 * 
	 * @return the session from the request (request.getSession()).
	 */
	protected HttpSession getSession() {
		return getRequest().getSession();
	}
	@SuppressWarnings("unchecked")
	protected Map getSessionMap(){
		return this.sessionMap;
	}
	protected Object getBean(String beanName){
		return null;
	}
	@SuppressWarnings("unchecked")


	public void setServletResponse(HttpServletResponse arg0) {
		this.response=arg0;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		this.request=arg0;
	}

	public void setSession(Map<String, Object> arg0) {
			this.sessionMap=arg0;
	}
}
