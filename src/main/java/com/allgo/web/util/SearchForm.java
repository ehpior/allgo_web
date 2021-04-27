package com.allgo.web.util;

public class SearchForm {
	
	private int rowsPerPage = 20;
	
	private int startIndex = 0;
	
	private Integer curPage = 0;
	private String code="000000";
	
	
	public void indexSet(int maxCnt){
		this.startIndex = Math.max(0, (curPage-1) * rowsPerPage);
	}
	
	
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getRowsPerPage() {
		return rowsPerPage;
	}
	public void setRowsPerPage(int rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}
	public Integer getCurPage() {
		return curPage;
	}
	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
