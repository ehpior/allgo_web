package com.allgo.web.init;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.allgo.web.dto.StockInfo;
import com.allgo.web.service.AdminService;
import com.allgo.web.vo.stock_list;

@Configuration
public class InitApplication {
	
	@Autowired
	AdminService adminServ;
	
	@Autowired
	StockInfo stockList;
	
	/*@Resource(name = "workExecutor")
	private ThreadPoolTaskExecutor workExecutor;*/

	@PostConstruct
	public void initialize(){
		System.out.println("start init");
		
		ArrayList<stock_list> stockInfo = adminServ.stockListInit();
		
		stockList.setCnt(stockInfo.size());
		stockList.setStocks_list(stockInfo);
		
		HashMap<String, stock_list> stocks = new HashMap<>();
		for(stock_list sinfo :stockInfo){
			stocks.put(sinfo.getCode(), sinfo);
		}
		stockList.setStocks(stocks);
		
		System.out.println(stockInfo.size());
		
		/*RedisUpdateThread thread = new RedisUpdateThread();
		workExecutor.execute(thread);*/
	}

}
