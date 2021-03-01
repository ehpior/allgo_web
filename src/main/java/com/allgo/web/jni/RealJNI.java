package com.allgo.web.jni;

import com.allgo.web.packet.RealCheg;
import com.allgo.web.packet.RealProgram;

public class RealJNI {
	
	protected int kospi_cnt = 0;
	protected int kosdaq_cnt = 0;
	
	protected RealCheg[] realCheg;
	protected RealProgram[] realProgram;
	
	public native void updateCnt();
	
	public native void updateRealCheg(RealCheg[] real_cheg);
	public native void updateRealProgram(RealProgram[] real_program);

	static { System.loadLibrary("realjni"); }
	
	public RealJNI(){
		
		update();
		
		//realCheg = new RealCheg[kospi_cnt];
		//realCheg = new RealCheg[kosdaq_cnt];
		
		//updateCnt();
		
		
	}
	
	public void testcnt(){
		System.out.println(kospi_cnt);
		System.out.println(kosdaq_cnt);
		
		updateCnt();
		
		System.out.println(kospi_cnt);
		System.out.println(kosdaq_cnt);
	}
	
	public void update(){
		updateRealCheg(realCheg);
		updateRealProgram(realProgram);
	}
}