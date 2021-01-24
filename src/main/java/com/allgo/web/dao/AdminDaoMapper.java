package com.allgo.web.dao;

import org.springframework.stereotype.Repository;

import com.allgo.web.dto.AdminDto;

@Repository
public interface AdminDaoMapper {
	
	int adminLoginCheck(AdminDto adminDto);
	
}
