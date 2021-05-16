package com.allgo.web.dto;

import lombok.Data;

@Data
public class SearchForm {
	
	private int rowsPerPage = 100;
	private int startIndex = 0;
	private Integer curPage = 0;
	private String searchCode = "";
	private String startDate = "";
	private String endDate = "";
	
	private String type = "";
	
	
	public void indexSet(int maxCnt){
		this.startIndex = Math.max(0, (curPage-1) * rowsPerPage);
	}
}
