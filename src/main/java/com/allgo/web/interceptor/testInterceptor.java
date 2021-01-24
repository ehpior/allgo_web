package com.allgo.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class testInterceptor implements HandlerInterceptor{
	
	// controller�� ������ ���� ó���ϴ� ���ͼ���
	// ��ȯ�� false��� controller�� ��û�� ����
	// �Ű����� Object�� �ڵ鷯 ������ �ǹ��Ѵ�. ( RequestMapping , DefaultServletHandler ) 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		
		System.out.println("MyInterCeptor - preHandle");
		return true;
	}
	
	// controller�� handler�� ������ ó����
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mav) throws Exception {
		System.out.println("testInterceptor - postHandle");
	}
	
	// view���� ó���� ���� �Ŀ� ó����
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e) throws Exception {
		System.out.println("testInterceptor - afterCompletion");
	}

}
