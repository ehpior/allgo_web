package com.allgo.web.packet;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class opt10081 {
	private String code;	// 0.�����ڵ�[6]
	private int price;		// 1.���簡
	private int volume;		// 2.�ŷ���
	private int amount;		// 3.�ŷ����
	private String date;	// 4.����[8]
	private int open;		// 5.�ð�
	private int high;		// 6.��
	private int low;		// 7.����
	private int a1;			// �����ְ�����
	private int a2;			// ��������
	private int a3;			// ���������
	private int a4;			// �Ҿ�������
	private int a5;			// ��������
	private int a6;			// �����ְ��̺�Ʈ
	private int a7;			// ��������
	
	public String[] types(){
		String[] output = new String[8];
		
		output[0] = "�����ڵ�";
		output[1] = "���簡";
		output[2] = "�ŷ���";
		output[3] = "�ŷ����";
		output[4] = "����";
		output[5] = "�ð�";
		output[6] = "��";
		output[7] = "����";
		
		return output;
	}
	
	public Object[] items(){
		Object[] output = new Object[8];
		
		output[0] = code;
		output[1] = price;
		output[2] = volume;
		output[3] = amount;
		output[4] = date;
		output[5] = open;
		output[6] = high;
		output[7] = low;
		
		return output;
	}
	
	@Override
	public String toString() {
		return "opt10081 [code=" + code + ", price=" + price + ", volume=" + volume + ", amount=" + amount + ", date="
				+ date + ", open=" + open + ", high=" + high + ", low=" + low + "]";
	}

	public opt10081 convert(byte[] data) throws UnsupportedEncodingException{
		opt10081 result = new opt10081();
		
		ByteBuffer buf = ByteBuffer.wrap(data);
		buf.order(ByteOrder.LITTLE_ENDIAN);
		byte[] code = new byte[6];
		buf.get(code,0,6);
		result.setCode(new String(code, "UTF-8"));
		result.setPrice(buf.getInt());
		result.setVolume(buf.getInt());
		result.setAmount(buf.getInt());
		byte[] date = new byte[8];
		buf.get(date,0,8);
		result.setDate(new String(date, "UTF-8"));
		result.setOpen(buf.getInt());
		result.setHigh(buf.getInt());
		result.setLow(buf.getInt());
		
		/*ByteBuffer buf = ByteBuffer.wrap(data);
		buf.order(ByteOrder.LITTLE_ENDIAN);
		result.setCode(buf.getInt(0));
		result.setPrice(buf.getInt(4));
		result.setVolume(buf.getInt(8));
		result.setAmount(buf.getInt(12));
		result.setDate(buf.getInt(16));
		result.setOpen(buf.getInt(20));
		result.setHigh(buf.getInt(24));
		result.setLow(buf.getInt(28));*/
		
		return result;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getOpen() {
		return open;
	}
	public void setOpen(int open) {
		this.open = open;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
	public int getA2() {
		return a2;
	}
	public void setA2(int a2) {
		this.a2 = a2;
	}
	public int getA3() {
		return a3;
	}
	public void setA3(int a3) {
		this.a3 = a3;
	}
	public int getA4() {
		return a4;
	}
	public void setA4(int a4) {
		this.a4 = a4;
	}
	public int getA5() {
		return a5;
	}
	public void setA5(int a5) {
		this.a5 = a5;
	}
	public int getA6() {
		return a6;
	}
	public void setA6(int a6) {
		this.a6 = a6;
	}
	public int getA7() {
		return a7;
	}
	public void setA7(int a7) {
		this.a7 = a7;
	}
	
}
