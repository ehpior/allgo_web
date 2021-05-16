package com.allgo.web.vo;

import java.util.ArrayList;

import lombok.Data;

@Data
public class ag_score {
	
	private String date;
	private String type;
	private String code;
	private String name_kor;
	private String score;
	private String create_time;
	
	public static ArrayList<String> types(){
		ArrayList<String> output = new ArrayList<>();
	
		output.add("일자");
		output.add("타입");
		output.add("종목코드");
		output.add("종목명");
		output.add("점수");
		
		return output;
	}

}
