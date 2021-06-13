package com.allgo.web.vo;

public class AgPortfolioHistory {
	
	private int seq = 0;
	private int p_seq = 0;
	private String ag_type = "";
	
	private int id = 0;
	private int sub_id = 0;
	
	private String code = "";
	private String stock_name = "";
	private String date = "";
	
	private int price = 0;
	private double target_rate = 0;
	private double loss_rate = 0;
	private int holding_day = 0;
	private String reason = "";
	private double percent = 0;
	
	private String type = "";
	private String status = "";
	private String is_delete = "";
	
	private String create_time = "";
	private String update_time = "";
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getP_seq() {
		return p_seq;
	}
	public void setP_seq(int p_seq) {
		this.p_seq = p_seq;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTarget_rate() {
		return target_rate;
	}
	public void setTarget_rate(double target_rate) {
		this.target_rate = target_rate;
	}
	public double getLoss_rate() {
		return loss_rate;
	}
	public void setLoss_rate(double loss_rate) {
		this.loss_rate = loss_rate;
	}
	public int getHolding_day() {
		return holding_day;
	}
	public void setHolding_day(int holding_day) {
		this.holding_day = holding_day;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(String is_delete) {
		this.is_delete = is_delete;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public String getAg_type() {
		return ag_type;
	}
	public void setAg_type(String ag_type) {
		this.ag_type = ag_type;
	}
}
