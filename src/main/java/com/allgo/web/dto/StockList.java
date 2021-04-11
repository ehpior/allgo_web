package com.allgo.web.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StockList {
	
	private int cnt;
	private ArrayList<StockInfo> stocks_list;
	private HashMap<String, StockInfo> stocks;
	
	public ArrayList<String> types(){
		ArrayList<String> output = new ArrayList<>();
	
		output.add("종목코드");
		output.add("종목명");
		output.add("장구분");
		output.add("현재가");
		
		return output;
	}
	
	public List<StockInfo> items(){
		List<StockInfo> output = stocks_list.subList(0, 5);
		
		output.add(stocks.get("153270"));
		
		return output;
	}

	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public ArrayList<StockInfo> getStocks_list() {
		return stocks_list;
	}
	public void setStocks_list(ArrayList<StockInfo> stocks_list) {
		this.stocks_list = stocks_list;
	}
	public HashMap<String, StockInfo> getStocks() {
		return stocks;
	}
	public void setStocks(HashMap<String, StockInfo> stocks) {
		this.stocks = stocks;
	}

}
