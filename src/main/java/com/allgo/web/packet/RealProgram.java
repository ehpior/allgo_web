package com.allgo.web.packet;

public class RealProgram {
	
	private String code;	// 종목코드[6]
	private String time;   // 0. 체결시간[6]
	private int price;   // 1. 현재가
	private String plus_minus;   // 2. 전일대비기호[1]
	private int change_price;   // 3. 전일대비
	private int increase_rate;   // 4. 등락율
	private int cul_volume;   // 5. 누적거래량
	private int sell_volume;   // 6. 매도수량
	private int sell_amount;   // 7. 매도금액
	private int buy_volume;   // 8. 매수수량
	private int buy_amount;   // 9. 매수금액
	private int net_buy_volume;   // 10. 순매수수량
	private int net_buy_amount;   // 11. 순매수금액
	private int a1;   // 12. 순매수금액증감
	private int a2;   // 13. 장시작예상잔여시간
	private int market;   // 14. 장운영구분
	private int ticker;   // 15. 투자자별ticker
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPlus_minus() {
		return plus_minus;
	}
	public void setPlus_minus(String plus_minus) {
		this.plus_minus = plus_minus;
	}
	public int getChange_price() {
		return change_price;
	}
	public void setChange_price(int change_price) {
		this.change_price = change_price;
	}
	public int getIncrease_rate() {
		return increase_rate;
	}
	public void setIncrease_rate(int increase_rate) {
		this.increase_rate = increase_rate;
	}
	public int getCul_volume() {
		return cul_volume;
	}
	public void setCul_volume(int cul_volume) {
		this.cul_volume = cul_volume;
	}
	public int getSell_volume() {
		return sell_volume;
	}
	public void setSell_volume(int sell_volume) {
		this.sell_volume = sell_volume;
	}
	public int getSell_amount() {
		return sell_amount;
	}
	public void setSell_amount(int sell_amount) {
		this.sell_amount = sell_amount;
	}
	public int getBuy_volume() {
		return buy_volume;
	}
	public void setBuy_volume(int buy_volume) {
		this.buy_volume = buy_volume;
	}
	public int getBuy_amount() {
		return buy_amount;
	}
	public void setBuy_amount(int buy_amount) {
		this.buy_amount = buy_amount;
	}
	public int getNet_buy_volume() {
		return net_buy_volume;
	}
	public void setNet_buy_volume(int net_buy_volume) {
		this.net_buy_volume = net_buy_volume;
	}
	public int getNet_buy_amount() {
		return net_buy_amount;
	}
	public void setNet_buy_amount(int net_buy_amount) {
		this.net_buy_amount = net_buy_amount;
	}
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
	public int getA2() {
		return a2;
	}
	public void setA2(int a2) {
		this.a2 = a2;
	}
	public int getMarket() {
		return market;
	}
	public void setMarket(int market) {
		this.market = market;
	}
	public int getTicker() {
		return ticker;
	}
	public void setTicker(int ticker) {
		this.ticker = ticker;
	}
	
}
