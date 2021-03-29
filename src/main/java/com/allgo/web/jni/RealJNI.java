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
	
	
	public int getKospi_cnt() {
		return kospi_cnt;
	}
	public void setKospi_cnt(int kospi_cnt) {
		this.kospi_cnt = kospi_cnt;
	}
	public int getKosdaq_cnt() {
		return kosdaq_cnt;
	}
	public void setKosdaq_cnt(int kosdaq_cnt) {
		this.kosdaq_cnt = kosdaq_cnt;
	}
	public RealCheg[] getRealCheg() {
		return realCheg;
	}
	public void setRealCheg(RealCheg[] realCheg) {
		this.realCheg = realCheg;
	}
	public RealProgram[] getRealProgram() {
		return realProgram;
	}
	public void setRealProgram(RealProgram[] realProgram) {
		this.realProgram = realProgram;
	}
	
}