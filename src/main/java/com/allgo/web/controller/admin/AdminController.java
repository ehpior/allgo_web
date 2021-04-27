package com.allgo.web.controller.admin;

import java.util.Date;
import java.util.List;

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
import com.allgo.web.dto.StockList;
import com.allgo.web.packet.AllgoScore;
import com.allgo.web.packet.RealCheg;
import com.allgo.web.packet.RealProgram;
import com.allgo.web.packet.opt10081;
import com.allgo.web.redis.RedisService;
import com.allgo.web.service.AdminService;
import com.allgo.web.util.Paging;
import com.allgo.web.util.SearchForm;
import com.allgo.web.util.SessionUtils;
import com.allgo.web.util.WebUtils;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	AdminService adminServ;
	
	@Autowired
	StockList stockList;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@Autowired
    private RedisService redisService;
	
	
	@RequestMapping(value = "/test.redis")
	public String testRedis(HttpServletRequest request, HttpServletResponse response) {
		redisService.checkAll();
		
		return "redirect:/admin/main.allgo";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String allgo(HttpServletRequest request, HttpServletResponse response) {
		logger.info("/");
		
		return "redirect:/admin/main.allgo";
	}
	
	@RequestMapping(value = "/main.allgo", method = RequestMethod.GET)
	public String main(HttpServletRequest request, HttpServletResponse response) {
		logger.info("/main.allgo");
		
		Date date = new Date();
		
		return "admin/main";
	}
	
	@RequestMapping(value = "/stocks.allgo")
	public String stocks(HttpServletRequest request, HttpServletResponse response, SearchForm sForm){
		logger.info("/stocks.allgo");

		Paging paging = new Paging(stockList.getCnt(), sForm.getCurPage());
		
		request.setAttribute("types", stockList.types());
		request.setAttribute("items", stockList.items(paging.getStartIndex(), paging.getEndIndex()));
		request.setAttribute("paging", paging);
		
		return "admin/stocks";
	}
	@RequestMapping(value = "/stocks_cheg.allgo")
	public String stocks_cheg(HttpServletRequest request, HttpServletResponse response, SearchForm sForm){
		logger.info("/stocks_cheg.allgo");
		
		
		Paging paging = new Paging(stockList.getCnt(), sForm.getCurPage());
		
		sForm.indexSet(stockList.getCnt());
		
		List<RealCheg> list = adminServ.getRealCheg(sForm);
		
		request.setAttribute("types", RealCheg.types());
		request.setAttribute("items", list);
		request.setAttribute("paging", paging);
		
		return "admin/stocks_cheg";
	}
	@RequestMapping(value = "/stocks_program.allgo")
	public String stocks_program(HttpServletRequest request, HttpServletResponse response, SearchForm sForm){
		logger.info("/stocks_program.allgo");
		
		Paging paging = new Paging(stockList.getCnt(), sForm.getCurPage());
		
		sForm.indexSet(stockList.getCnt());
		
		List<RealProgram> list = adminServ.getRealProgram(sForm);
		
		request.setAttribute("types", RealProgram.types());
		request.setAttribute("items", list);
		request.setAttribute("paging", paging);
		
		return "admin/stocks_program";
	}
	@RequestMapping(value = "/allgos.allgo")
	public String allgo(HttpServletRequest request, HttpServletResponse response, SearchForm sForm){
		logger.info("/allgo.allgo");
		
		Paging paging = new Paging(stockList.getCnt(), sForm.getCurPage());
		
		sForm.indexSet(stockList.getCnt());
		
		List<AllgoScore> list = adminServ.getAllgoScore(sForm);
		
		request.setAttribute("types", AllgoScore.types());
		request.setAttribute("items", list);
		request.setAttribute("paging", paging);
		
		return "admin/allgos";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/admin.login", method = RequestMethod.GET)
	public String loginPage(HttpServletRequest request, HttpServletResponse response) {
		logger.info("admin.login");
		
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
	
	@RequestMapping(value = "/jniTest2.do")
	@ResponseBody
	public String jniTest2(HttpServletRequest request, HttpServletResponse response, String jniTest) {
		logger.info("jniTest2.do");
		
		System.out.println(jniTest);
		
		opt10081 opt10081 = (opt10081)WebUtils.clientTest(jniTest);
		
		return opt10081.toString();
	}
}
