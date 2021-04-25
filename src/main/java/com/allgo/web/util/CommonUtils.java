package com.allgo.web.util;

import java.util.List;

import com.allgo.web.dto.StockInfo;

public class CommonUtils {
	
	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
	}

	public static int str2Int(String value, int defaultValue){
		if(isInteger(value)){
			return Integer.parseInt(value);
		} else{
			return defaultValue;
		}
	}
	
}
