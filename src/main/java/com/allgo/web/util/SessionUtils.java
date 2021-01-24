package com.allgo.web.util;

import javax.servlet.http.HttpServletRequest;

public class SessionUtils {

	public static void setObject(HttpServletRequest request, String key, Object value){
		request.getSession().setAttribute(key, value);
		request.getSession().setMaxInactiveInterval(60*60*3);
	}
	public static Object getObject(HttpServletRequest request, String key){
		Object obj = request.getSession().getAttribute(key);
		return obj;
	}
	public static void removeObject(HttpServletRequest request, String key){
		request.getSession().removeAttribute(key);
	}
}
