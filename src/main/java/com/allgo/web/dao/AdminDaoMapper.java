package com.allgo.web.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.allgo.web.dto.AdminDto;
import com.allgo.web.dto.SearchForm;
import com.allgo.web.vo.ag_score;
import com.allgo.web.vo.stock_cheg;
import com.allgo.web.vo.stock_list;
import com.allgo.web.vo.stock_program;

@Repository
public interface AdminDaoMapper {
	
	int adminLoginCheck(AdminDto adminDto);
	
	ArrayList<stock_list> stockInfoInit();
	
	ArrayList<stock_cheg> getStock_cheg(SearchForm sForm);
	int cntStock_cheg(SearchForm sForm);
	
	ArrayList<stock_program> getStock_program(SearchForm sForm);
	int cntStock_program(SearchForm sForm);
	
	ArrayList<ag_score> getAg_score(SearchForm sForm);
	int cntAg_score(SearchForm sForm);
	
	int getStockCnt();
	
}
