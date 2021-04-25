package com.allgo.web.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.allgo.web.dto.AdminDto;
import com.allgo.web.dto.StockInfo;
import com.allgo.web.packet.RealCheg;
import com.allgo.web.packet.RealProgram;

@Repository
public interface AdminDaoMapper {
	
	int adminLoginCheck(AdminDto adminDto);
	ArrayList<StockInfo> stockListInit();
	ArrayList<RealCheg> getRealCheg();
	ArrayList<RealProgram> getRealProgram();
	int getStockCnt();
	
}
