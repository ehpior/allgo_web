package com.allgo.web.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allgo.web.dao.AdminDaoMapper;
import com.allgo.web.dto.AdminDto;
import com.allgo.web.dto.SearchForm;
import com.allgo.web.vo.AgPortfolio;
import com.allgo.web.vo.ag_score;
import com.allgo.web.vo.stock_cheg;
import com.allgo.web.vo.stock_list;
import com.allgo.web.vo.stock_program;

@Service
public class AdminService {
	
	@Autowired
	private AdminDaoMapper aDao;
	
	public int adminLoginCheck(AdminDto adminDto){
		return aDao.adminLoginCheck(adminDto);
	}
	
	public ArrayList<stock_list> stockListInit(){
		return aDao.stockInfoInit();
	}
	public ArrayList<stock_cheg> getStock_cheg(SearchForm sForm){
		return aDao.getStock_cheg(sForm);
	}
	public int cntStock_cheg(SearchForm sForm){
		return aDao.cntStock_cheg(sForm);
	}
	public ArrayList<stock_program> getStock_program(SearchForm sForm){
		return aDao.getStock_program(sForm);
	}
	public int cntStock_program(SearchForm sForm){
		return aDao.cntStock_program(sForm);
	}
	public ArrayList<ag_score> getAg_score(SearchForm sForm){
		return aDao.getAg_score(sForm);
	}
	public int cntAg_score(SearchForm sForm){
		return aDao.cntAg_score(sForm);
	}
	public int getStockCnt(){
		return aDao.getStockCnt();
	}
	public ArrayList<AgPortfolio> selectPortfolio(SearchForm sForm){
		return aDao.selectPortfolio(sForm);
	}
	public int getTotalCntPortfolio(){
		return aDao.getTotalCntPortfolio();
	}

}
