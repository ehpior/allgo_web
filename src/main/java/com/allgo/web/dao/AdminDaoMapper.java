package com.allgo.web.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.allgo.web.dto.AdminDto;
import com.allgo.web.dto.StockInfo;

@Repository
public interface AdminDaoMapper {
	
	int adminLoginCheck(AdminDto adminDto);
	ArrayList<StockInfo> stockListInit();
	
}
