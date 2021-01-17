package com.allgo.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allgo.test.dao.testDaoMapper;

@Service
public class testService {
	
	@Autowired
	private testDaoMapper tDao;
	
	public void testCount(){
		System.out.println(tDao.testCount());
	}

}
