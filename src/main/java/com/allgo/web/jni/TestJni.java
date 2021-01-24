package com.allgo.web.jni;

public class TestJni {
	public native void printHello();
	public native void printString(String str);

	static { System.loadLibrary("testjni"); }
	
	public static void main(String args[]) {
		TestJni myJNI = new TestJni();
		myJNI.printHello();
		myJNI.printString("Hello World");
	}
}