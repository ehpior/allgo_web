package com.allgo.web.vo;

import java.util.ArrayList;

public class AgPortfolio {
	private int id = 0;
	private int p_seq = 0;
	private String ag_type = "";
	private String code = "";
	private int holding_day = 0;
	private String stock_name = "";
	private int average_buy_price = 0;
	private int average_sell_price = 0;
	private String first_buy_date = "";
	private String status = "";
	
	private int cur_price = 0;
	private double rate = 0;
	
	@Override
	public String toString() {
		return "AgPortfolio [id=" + id + ", p_seq=" + p_seq + ", code=" + code + ", stock_name=" + stock_name
				+ ", average_buy_price=" + average_buy_price + ", average_sell_price=" + average_sell_price
				+ ", holding_day=" + holding_day + ", cur_price=" + cur_price + ", status=" + status + ", rate=" + rate
				+ ", agPortHistory=" + agPortHistory + "]";
	}

	private ArrayList<AgPortfolioHistory> agPortHistory;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getP_seq() {
		return p_seq;
	}

	public void setP_seq(int p_seq) {
		this.p_seq = p_seq;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStock_name() {
		return stock_name;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}

	public int getAverage_buy_price() {
		return average_buy_price;
	}

	public void setAverage_buy_price(int average_buy_price) {
		this.average_buy_price = average_buy_price;
	}

	public int getAverage_sell_price() {
		return average_sell_price;
	}

	public void setAverage_sell_price(int average_sell_price) {
		this.average_sell_price = average_sell_price;
	}

	public int getHolding_day() {
		return holding_day;
	}

	public void setHolding_day(int holding_day) {
		this.holding_day = holding_day;
	}

	public int getCur_price() {
		return cur_price;
	}

	public void setCur_price(int cur_price) {
		this.cur_price = cur_price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public ArrayList<AgPortfolioHistory> getAgPortHistory() {
		return agPortHistory;
	}

	public void setAgPortHistory(ArrayList<AgPortfolioHistory> agPortHistory) {
		this.agPortHistory = agPortHistory;
	}

	public String getAg_type() {
		return ag_type;
	}

	public void setAg_type(String ag_type) {
		this.ag_type = ag_type;
	}

	public String getFirst_buy_date() {
		return first_buy_date;
	}

	public void setFirst_buy_date(String first_buy_date) {
		this.first_buy_date = first_buy_date;
	}
}
