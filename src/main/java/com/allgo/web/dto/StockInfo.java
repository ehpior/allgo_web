package com.allgo.web.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.allgo.web.vo.stock_list;

import lombok.Data;

@Data
public class StockInfo {
	
	private int cnt;
	private ArrayList<stock_list> stocks_list;
	private HashMap<String, stock_list> stocks;
	
	public ArrayList<String> types(){
		ArrayList<String> output = new ArrayList<>();
	
		output.add("No");
		output.add("종목코드");
		output.add("종목명");
		output.add("장구분");
		output.add("현재가");
		
		return output;
	}
	
	public List<stock_list> items(int startIndex, int endIndex){
		
		List<stock_list> output = stocks_list.subList(startIndex, endIndex);
		
		return output;
	}

}
