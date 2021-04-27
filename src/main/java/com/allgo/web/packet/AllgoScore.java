package com.allgo.web.packet;

import java.util.ArrayList;
import java.util.List;

import com.allgo.web.dto.StockInfo;

public class AllgoScore {
	
	private int index;
	private String date;
	private int rank;
	private String type;
	private String code;
	private String score;
	
	public static ArrayList<String> types(){
		ArrayList<String> output = new ArrayList<>();
	
		output.add("일자");
		output.add("랭크");
		output.add("타입");
		output.add("종목코드");
		output.add("점수");
		
		return output;
	}

	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
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
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
