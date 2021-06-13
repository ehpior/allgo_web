package com.allgo.web.controller.admin;

import java.util.ArrayList;
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
import com.allgo.web.dto.SearchForm;
import com.allgo.web.dto.StockInfo;
import com.allgo.web.packet.opt10081;
import com.allgo.web.redis.RedisService;
import com.allgo.web.service.AdminService;
import com.allgo.web.util.Paging;
import com.allgo.web.util.SessionUtils;
import com.allgo.web.util.WebUtils;
import com.allgo.web.vo.AgPortfolio;
import com.allgo.web.vo.ag_score;
import com.allgo.web.vo.stock_cheg;
import com.allgo.web.vo.stock_program;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	AdminService adminServ;
	
	@Autowired
	StockInfo stockList;
	
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
	
	@RequestMapping(value = "/stocks/list.allgo")
	public String stocks(HttpServletRequest request, HttpServletResponse response, SearchForm sForm){
		logger.info("/stocks.allgo");

		//Paging paging = new Paging(stockList.getCnt(), sForm.getCurPage());
		
		request.setAttribute("types", stockList.types());
		//request.setAttribute("items", stockList.items(paging.getStartIndex(), paging.getEndIndex()));
		request.setAttribute("items", stockList.getStocks_list());
		//request.setAttribute("paging", paging);
		
		return "admin/stocks/list";
	}
	@RequestMapping(value = "/stocks/cheg.allgo")
	public String stocks_cheg(HttpServletRequest request, HttpServletResponse response, SearchForm sForm){
		logger.info("/stocks_cheg.allgo");
		
		int cnt = adminServ.cntStock_cheg(sForm);
		
		Paging paging = new Paging(cnt, sForm.getCurPage());
		
		sForm.indexSet(cnt);
		
		List<stock_cheg> list = adminServ.getStock_cheg(sForm);
		
		request.setAttribute("types", stock_cheg.types());
		request.setAttribute("items", list);
		request.setAttribute("paging", paging);
		
		return "admin/stocks/cheg";
	}
	@RequestMapping(value = "/stocks/program.allgo")
	public String stocks_program(HttpServletRequest request, HttpServletResponse response, SearchForm sForm){
		logger.info("/stocks_program.allgo");
		
		int cnt = adminServ.cntStock_program(sForm);
		
		Paging paging = new Paging(cnt, sForm.getCurPage());
		
		sForm.indexSet(cnt);
		
		List<stock_program> list = adminServ.getStock_program(sForm);
		
		request.setAttribute("types", stock_program.types());
		request.setAttribute("items", list);
		request.setAttribute("paging", paging);
		
		return "admin/stocks/program";
	}
	
	@RequestMapping(value = "/allgo/score.allgo")
	public String allgo(HttpServletRequest request, HttpServletResponse response, SearchForm sForm){
		logger.info("/allgo.allgo");
		
		int cnt = adminServ.cntAg_score(sForm);
		
		Paging paging = new Paging(cnt, sForm.getCurPage());
		
		sForm.indexSet(cnt);
		
		List<ag_score> list = adminServ.getAg_score(sForm);
		
		request.setAttribute("types", ag_score.types());
		request.setAttribute("items", list);
		request.setAttribute("paging", paging);
		
		return "admin/allgo/score";
	}
	
	@RequestMapping(value = "/allgo/portfolio.allgo")
	public String portfolio(HttpServletRequest request, HttpServletResponse response, SearchForm sForm){
		logger.info("/portfolio.allgo");
		
		int cnt = adminServ.getTotalCntPortfolio();
		
		Paging paging = new Paging(cnt, sForm.getCurPage());
		
		sForm.indexSet(cnt);
		
		ArrayList<AgPortfolio> pList = adminServ.selectPortfolio(sForm);
		
		for(AgPortfolio hk : pList){
			hk.setCur_price(stockList.getCur_price(hk.getCode()));
		}
		
		request.setAttribute("pList", pList);
		request.setAttribute("paging", paging);
		
		return "admin/allgo/portfolio";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/admin.login", method = RequestMethod.GET)
	public String loginPage(HttpServletRequest request, HttpServletResponse response) {
		logger.info("admin.login");
		
		AdminDto adminDto = (AdminDto) SessionUtils.getObject(request, "login");
		
		if(adminDto != null){
			return "redirect:/admin/main.allgo";
		}
		
		return "admin/login/login";
	}
	
	@RequestMapping(value = "/signUp.login", method = RequestMethod.GET)
	public String signUpPage(HttpServletRequest request, HttpServletResponse response) {
		logger.info("signUp.login");
		
		return "admin/login/register";
	}
	
	@RequestMapping(value = "/password.login", method = RequestMethod.GET)
	public String passwordPage(HttpServletRequest request, HttpServletResponse response) {
		logger.info("password.login");
		
		return "admin/login/password";
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
