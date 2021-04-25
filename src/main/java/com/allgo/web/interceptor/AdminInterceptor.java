package com.allgo.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AdminInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		
		System.out.println("MyInterCeptor - preHandle");
		//response.sendRedirect("/admin/login.allgo");
		
		/*AdminDto adminDto = (AdminDto)SessionUtils.getObject(request, "login");
		if(adminDto == null){
			response.sendRedirect("/admin/admin.login");
			return false;
		}*/
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mav) throws Exception {
		//System.out.println("testInterceptor - postHandle");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e) throws Exception {
		//System.out.println("testInterceptor - afterCompletion");
	}

}
