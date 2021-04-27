package com.allgo.web.util;

public class Paging {
	private int curPage = 1;
	
	private int rowCnt; // 데이터 총 개수
	
	private int startPage;
	private int endPage;
	
	private int startIndex;
	private int endIndex;
	
	private int lastPage; // 마지막 페이지
	
	private int pageSize = 10;
	private int rowsPerPage = 20;
	

	@Override
	public String toString() {
		return "Paging [curPage=" + curPage + ", rowCnt=" + rowCnt + ", startPage=" + startPage + ", endPage=" + endPage
				+ ", startIndex=" + startIndex + ", endIndex=" + endIndex + ", lastPage=" + lastPage + ", pageSize="
				+ pageSize + ", rowsPerPage=" + rowsPerPage + "]";
	}

	public Paging(int rowCnt, Integer curPage){
		this.rowCnt = rowCnt;
		this.lastPage = rowCnt/this.rowsPerPage + 1;
		this.curPage = CommonUtils.str2Int(curPage.toString(), 1);
		
		if(this.curPage > this.lastPage){
			this.curPage = this.lastPage;
		} else if(this.curPage < 1){
			this.curPage = 1;
		}
		
		this.startPage = Math.max(1, this.pageSize * ((this.curPage-1)/this.pageSize) + 1);
		this.endPage = Math.min(lastPage, this.pageSize * ((this.curPage-1)/this.pageSize + 1));
		
		this.startIndex = Math.max(0, (this.curPage-1)*this.rowsPerPage);
		this.endIndex = Math.min(this.rowCnt, (this.curPage)*this.rowsPerPage);
	}
	
	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getRowCnt() {
		return rowCnt;
	}
	public void setRowCnt(int rowCnt) {
		this.rowCnt = rowCnt;
	}
	public int getLastPage() {
		return lastPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getRowsPerPage() {
		return rowsPerPage;
	}
	public void setRowsPerPage(int rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}
	
}
