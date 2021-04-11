package com.allgo.web.dto;

import java.util.ArrayList;
import java.util.HashMap;

public class StockList {
	
	private int cnt;
	private ArrayList<StockInfo> stocks_list;
	private HashMap<String, StockInfo> stocks;

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
