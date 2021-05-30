package com.allgo.web.dto;

public class SearchForm {
	
	private int rowsPerPage = 100;
	private int startIndex = 0;
	private Integer curPage = 0;
	private String search_code = "";
	private String start_date = "";
	private String end_date = "";
	private String search_date = "";
	
	private String type = "";
	
	
	public void indexSet(int maxCnt){
		this.startIndex = Math.max(0, (curPage-1) * rowsPerPage);
	}


	public int getRowsPerPage() {
		return rowsPerPage;
	}


	public void setRowsPerPage(int rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}


	public int getStartIndex() {
		return startIndex;
	}


	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}


	public Integer getCurPage() {
		return curPage;
	}


	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}

	public String getSearch_code() {
		return search_code;
	}


	public void setSearch_code(String search_code) {
		this.search_code = search_code;
	}


	public String getStart_date() {
		return start_date;
	}


	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}


	public String getEnd_date() {
		return end_date;
	}


	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}


	public String getSearch_date() {
		return search_date;
	}


	public void setSearch_date(String search_date) {
		this.search_date = search_date;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
}
