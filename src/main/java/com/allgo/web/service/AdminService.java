package com.allgo.web.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allgo.web.dao.AdminDaoMapper;
import com.allgo.web.dto.AdminDto;
import com.allgo.web.dto.SearchForm;
import com.allgo.web.packet.RealCheg;
import com.allgo.web.packet.RealProgram;
import com.allgo.web.vo.ag_score;
import com.allgo.web.vo.stock_list;

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
	public ArrayList<RealCheg> getRealCheg(SearchForm sForm){
		return aDao.getRealCheg(sForm);
	}
	public ArrayList<RealProgram> getRealProgram(SearchForm sForm){
		return aDao.getRealProgram(sForm);
	}
	public ArrayList<ag_score> getAg_score(SearchForm sForm){
		return aDao.getAg_score(sForm);
	}
	public int getStockCnt(){
		return aDao.getStockCnt();
	}

}
