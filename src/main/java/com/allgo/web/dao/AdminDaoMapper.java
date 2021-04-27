package com.allgo.web.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.allgo.web.dto.AdminDto;
import com.allgo.web.dto.StockInfo;
import com.allgo.web.packet.AllgoScore;
import com.allgo.web.packet.RealCheg;
import com.allgo.web.packet.RealProgram;
import com.allgo.web.util.SearchForm;

@Repository
public interface AdminDaoMapper {
	
	int adminLoginCheck(AdminDto adminDto);
	ArrayList<StockInfo> stockListInit();
	ArrayList<RealCheg> getRealCheg(SearchForm sForm);
	ArrayList<RealProgram> getRealProgram(SearchForm sForm);
	ArrayList<AllgoScore> getAllgoScore(SearchForm sForm);
	int getStockCnt();
	
}
