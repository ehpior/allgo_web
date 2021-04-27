package com.allgo.web.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allgo.web.dao.AdminDaoMapper;
import com.allgo.web.dto.AdminDto;
import com.allgo.web.dto.StockInfo;
import com.allgo.web.packet.AllgoScore;
import com.allgo.web.packet.RealCheg;
import com.allgo.web.packet.RealProgram;
import com.allgo.web.util.SearchForm;

@Service
public class AdminService {
	
	@Autowired
	private AdminDaoMapper aDao;
	
	public int adminLoginCheck(AdminDto adminDto){
		return aDao.adminLoginCheck(adminDto);
	}
	
	public ArrayList<StockInfo> stockListInit(){
		return aDao.stockListInit();
	}
	public ArrayList<RealCheg> getRealCheg(SearchForm sForm){
		return aDao.getRealCheg(sForm);
	}
	public ArrayList<RealProgram> getRealProgram(SearchForm sForm){
		return aDao.getRealProgram(sForm);
	}
	public ArrayList<AllgoScore> getAllgoScore(SearchForm sForm){
		return aDao.getAllgoScore(sForm);
	}
	public int getStockCnt(){
		return aDao.getStockCnt();
	}

}
