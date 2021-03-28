package com.allgo.web.init;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.allgo.web.jni.RealJNI;

public class InitApplication {
	
	@Autowired
	RealJNI realJNI;
	
	@PostConstruct
	public void initialize(){
		realJNI = new RealJNI();
	}

}
