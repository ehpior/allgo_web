package com.allgo.web.controller.admin;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.allgo.web.dto.AdminDto;
import com.allgo.web.jni.TestJni;
import com.allgo.web.service.AdminService;
import com.allgo.web.util.SessionUtils;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	AdminService adminServ;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(HttpServletRequest request, HttpServletResponse response) {
		logger.info("/");
		
		return "redirect:/admin/main.allgo";
	}
	
	@RequestMapping(value = "/main.allgo", method = RequestMethod.GET)
	public String main(HttpServletRequest request, HttpServletResponse response) {
		logger.info("/main.allgo");
		
		Date date = new Date();
		
		return "admin/index";
	}
	
	@RequestMapping(value = "/admin.login", method = RequestMethod.GET)
	public String loginPage(HttpServletRequest request, HttpServletResponse response) {
		logger.info("admin.login");
		
		/*TestJni hk = new TestJni();
		hk.printHello();
		hk.printString("testhk");
		System.out.println("123");*/
		
		AdminDto adminDto = (AdminDto) SessionUtils.getObject(request, "login");
		
		if(adminDto != null){
			return "redirect:/admin/main.allgo";
		}
		
		return "admin/login";
	}
	
	@RequestMapping(value = "/signUp.login", method = RequestMethod.GET)
	public String signUpPage(HttpServletRequest request, HttpServletResponse response) {
		logger.info("signUp.login");
		
		return "admin/register";
	}
	
	@RequestMapping(value = "/password.login", method = RequestMethod.GET)
	public String passwordPage(HttpServletRequest request, HttpServletResponse response) {
		logger.info("password.login");
		
		return "admin/password";
	}
	
	@RequestMapping(value = "/login.do")
	@ResponseBody
	public int login(HttpServletRequest request, HttpServletResponse response, AdminDto adminDto) {
		logger.info("login.do");
		
		int result = adminServ.adminLoginCheck(adminDto);
		
		if(result == 1){
			System.out.println("login.do success");
			SessionUtils.setObject(request, "login", adminDto);
		} else{
			System.out.println("login.do success");
		}
		
		return result;
	}
	
	@RequestMapping(value = "/loginResult.do")
	public String loginSuccess(HttpServletRequest request, HttpServletResponse response) {
		logger.info("loginSuccess.do");
		
		AdminDto adminDto = (AdminDto) SessionUtils.getObject(request, "login");
		
		if(adminDto == null){
			return "redirect:/admin/admin.login";
		} else{
			return "redirect:/admin/main.allgo";
		}
	}
	
	@RequestMapping(value = "/logout.do")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		logger.info("logout.do");
		
		SessionUtils.removeObject(request, "login");
		
		return "redirect:/admin/admin.login";
	}
	
	@RequestMapping(value = "/jniTest.do")
	@ResponseBody
	public void jniTest(HttpServletRequest request, HttpServletResponse response, String jniTest) {
		logger.info("jniTest.do");
		
		TestJni hk = new TestJni();
		hk.printHello();
		hk.printString(jniTest);
	}
}
