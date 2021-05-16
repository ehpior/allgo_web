package com.allgo.web.vo;

import java.util.ArrayList;

import lombok.Data;

@Data
public class stock_program {
	
	private String date = "";
	private String code = "";	// 종목코드[6]
	private String time = "";   // 0. 체결시간[6]
	private int price = 0;   // 1. 현재가
	private String plus_minus = "";   // 2. 전일대비기호[1]
	private int change_price = 0;   // 3. 전일대비
	private int increase_rate = 0;   // 4. 등락율
	private int cul_volume = 0;   // 5. 누적거래량
	private int sell_volume = 0;   // 6. 매도수량
	private int sell_amount = 0;   // 7. 매도금액
	private int buy_volume = 0;   // 8. 매수수량
	private int buy_amount = 0;   // 9. 매수금액
	private int net_buy_volume = 0;   // 10. 순매수수량
	private int net_buy_amount = 0;   // 11. 순매수금액
	private int a1 = 0;   // 12. 순매수금액증감
	private int a2 = 0;   // 13. 장시작예상잔여시간
	private int market = 0;   // 14. 장운영구분
	private int ticker = 0;   // 15. 투자자별ticker
	private String create_time = "";
	
	public static ArrayList<String> types(){
		ArrayList<String> output = new ArrayList<>();
		
		output.add("일자");
		output.add("종목코드");
		/*output.add("종가");
		output.add("전일대비");
		output.add("등락율");
		output.add("누적거래량");*/
		output.add("매도수량");
		output.add("매도금액");
		output.add("매수수량");
		output.add("매수금액");
		output.add("순매수수량");
		output.add("순매수금액");
		output.add("순매수금액증감");
		
		return output;
	}
	
}
