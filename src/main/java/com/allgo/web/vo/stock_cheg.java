package com.allgo.web.vo;

import java.util.ArrayList;

import lombok.Data;

@Data
public class stock_cheg {
	
	private String date = "";
	private String code = "";	// 종목코드[6]
	private String time = "";   // 0. 체결시간[6]
	private int price = 0;   // 1. 현재가
	private int change_price = 0;   // 2. 전일대비
	private int increase_rate = 0;   // 3. 등락율
	private int sell_1 = 0;      // 4. 최우선 매도호가
	private int buy_1 = 0;      // 5. 최우선 매수호가
	private int volume = 0;      // 6. 거래량
	private int cul_volume = 0;   // 7. 누적거래량
	private int cul_amount = 0;   // 8. 누적거래대금
	private int open = 0;      // 9. 시가
	private int high = 0;      // 10. 고가
	private int low = 0;      // 11. 저가
	private String plus_minus = "";   // 12. 전일대비기호 
	private int a1 = 0;      // 13. 전일거래량대비
	private int a2 = 0;      // 14. 거래대금증감
	private int a3 = 0;      // 15. 전일거래량대비(비율)
	private int turn_over = 0;   // 16. 거래회전율
	private int a4 = 0;      // 17. 거래비율
	private int volume_power = 0;   // 18. 체결강도
	private int capitalization = 0;   // 19. 시가총액(억)
	private int market = 0;      // 20. 장구분
	private int a5 = 0;      // 21. KO접근도
	private int high_time = 0;   // 22. 상한가발생시간
	private int low_time = 0;      // 23. 하한가발생시간
	private String create_time = "";
	
	public static ArrayList<String> types(){
		ArrayList<String> output = new ArrayList<>();
	
		output.add("일자");
		output.add("종목코드");
		output.add("종가");
		output.add("전일대비");
		output.add("등락율");
		output.add("누적거래량");
		output.add("누적거래대금");
		output.add("시가");
		output.add("고가");
		output.add("저가");
		output.add("전일거래량대비");
		output.add("거래대금증감");
		output.add("전일거래량대비(비율)");
		output.add("거래회전율");
		output.add("체결강도");
		output.add("시가총액(억)");
		
		return output;
	}
}
