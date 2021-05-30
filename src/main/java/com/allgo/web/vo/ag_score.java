package com.allgo.web.vo;

import java.util.ArrayList;

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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName_kor() {
		return name_kor;
	}

	public void setName_kor(String name_kor) {
		this.name_kor = name_kor;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

}
