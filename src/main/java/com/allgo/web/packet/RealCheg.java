package com.allgo.web.packet;

import java.util.ArrayList;
import java.util.List;

import com.allgo.web.dto.StockInfo;

public class RealCheg {
	
	private int index;
	private String code;	// 종목코드[6]
	private String time;   // 0. 체결시간[6]
	private int price;   // 1. 현재가
	private int change_price;   // 2. 전일대비
	private int increase_rate;   // 3. 등락율
	private int sell_1;      // 4. 최우선 매도호가
	private int buy_1;      // 5. 최우선 매수호가
	private int volume;      // 6. 거래량
	private int cul_volume;   // 7. 누적거래량
	private int cul_amount;   // 8. 누적거래대금
	private int open;      // 9. 시가
	private int high;      // 10. 고가
	private int low;      // 11. 저가
	private String plus_minus;   // 12. 전일대비기호 
	private int a1;      // 13. 전일거래량대비
	private int a2;      // 14. 거래대금증감
	private int a3;      // 15. 전일거래량대비(비율)
	private int turn_over;   // 16. 거래회전율
	private int a4;      // 17. 거래비율
	private int volume_power;   // 18. 체결강도
	private int capitalization;   // 19. 시가총액(억)
	private int market;      // 20. 장구분
	private int a5;      // 21. KO접근도
	private int high_time;   // 22. 상한가발생시간
	private int low_time;      // 23. 하한가발생시간
	
	public static ArrayList<String> types(){
		ArrayList<String> output = new ArrayList<>();
	
		output.add("No");
		output.add("종목코드");
		output.add("체결시간");
		output.add("현재가");
		output.add("전일대비");
		output.add("등락율");
		output.add("최우선 매도호가");
		output.add("최우선 매수호가");
		output.add("거래량");
		output.add("누적거래량");
		output.add("누적거래대금");
		output.add("시가");
		output.add("고가");
		output.add("저가");
		output.add("전일대비기호");
		output.add("전일거래량대비");
		output.add("거래대금증감");
		output.add("전일거래량대비(비율)");
		output.add("거래회전율");
		output.add("거래비율");
		output.add("체결강도");
		output.add("시가총액(억)");
		output.add("장구분");
		output.add("KO접근도");
		output.add("상한가발생시간");
		output.add("하한가발생시간");
		
		return output;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
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
	public int getSell_1() {
		return sell_1;
	}
	public void setSell_1(int sell_1) {
		this.sell_1 = sell_1;
	}
	public int getBuy_1() {
		return buy_1;
	}
	public void setBuy_1(int buy_1) {
		this.buy_1 = buy_1;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCul_volume() {
		return cul_volume;
	}
	public void setCul_volume(int cul_volume) {
		this.cul_volume = cul_volume;
	}
	public int getCul_amount() {
		return cul_amount;
	}
	public void setCul_amount(int cul_amount) {
		this.cul_amount = cul_amount;
	}
	public int getOpen() {
		return open;
	}
	public void setOpen(int open) {
		this.open = open;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public String getPlus_minus() {
		return plus_minus;
	}
	public void setPlus_minus(String plus_minus) {
		this.plus_minus = plus_minus;
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
	public int getA3() {
		return a3;
	}
	public void setA3(int a3) {
		this.a3 = a3;
	}
	public int getTurn_over() {
		return turn_over;
	}
	public void setTurn_over(int turn_over) {
		this.turn_over = turn_over;
	}
	public int getA4() {
		return a4;
	}
	public void setA4(int a4) {
		this.a4 = a4;
	}
	public int getVolume_power() {
		return volume_power;
	}
	public void setVolume_power(int volume_power) {
		this.volume_power = volume_power;
	}
	public int getCapitalization() {
		return capitalization;
	}
	public void setCapitalization(int capitalization) {
		this.capitalization = capitalization;
	}
	public int getMarket() {
		return market;
	}
	public void setMarket(int market) {
		this.market = market;
	}
	public int getA5() {
		return a5;
	}
	public void setA5(int a5) {
		this.a5 = a5;
	}
	public int getHigh_time() {
		return high_time;
	}
	public void setHigh_time(int high_time) {
		this.high_time = high_time;
	}
	public int getLow_time() {
		return low_time;
	}
	public void setLow_time(int low_time) {
		this.low_time = low_time;
	}

}
