package com.allgo.web.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.allgo.web.dto.AdminDto;
import com.allgo.web.packet.RealCheg;
import com.allgo.web.packet.RealProgram;
import com.allgo.web.util.SearchForm;
import com.allgo.web.vo.ag_score;
import com.allgo.web.vo.stock_list;

@Repository
public interface AdminDaoMapper {
	
	int adminLoginCheck(AdminDto adminDto);
	ArrayList<stock_list> stockInfoInit();
	ArrayList<RealCheg> getRealCheg(SearchForm sForm);
	ArrayList<RealProgram> getRealProgram(SearchForm sForm);
	ArrayList<ag_score> getAg_score(SearchForm sForm);
	int getStockCnt();
	
}
