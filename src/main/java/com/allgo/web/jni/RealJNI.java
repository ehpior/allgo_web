package com.allgo.web.jni;

import com.allgo.web.packet.RealCheg;
import com.allgo.web.packet.RealProgram;

public class RealJNI {
	
	protected int kospi_cnt = 3000;
	protected int kosdaq_cnt = 3000;
	
	public RealCheg[] realCheg;
	public RealProgram[] realProgram;
	
	public native void updateRealCheg(RealCheg[] real_cheg);
	public native void updateRealProgram(RealProgram[] real_program);

	static { System.loadLibrary("realjni"); }
	
	public RealJNI(){
		
		realCheg = new RealCheg[kospi_cnt];
		for( int i = 0; i < kospi_cnt; i++ ) {
			realCheg[i] = new RealCheg();
		}
		realProgram = new RealProgram[kosdaq_cnt];
		for( int i = 0; i < kosdaq_cnt; i++ ) {
			realProgram[i] = new RealProgram();
		}
		
	}
	
	public void update(){
		updateRealCheg(realCheg);
		updateRealProgram(realProgram);
	}
}