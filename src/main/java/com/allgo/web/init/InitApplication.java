package com.allgo.web.init;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.allgo.web.dto.StockInfo;
import com.allgo.web.dto.StockList;
import com.allgo.web.service.AdminService;

@Configuration
public class InitApplication {
	
	@Autowired
	AdminService adminServ;
	
	@Autowired
	StockList stockList;
	
	/*@Resource(name = "workExecutor")
	private ThreadPoolTaskExecutor workExecutor;*/

	@PostConstruct
	public void initialize(){
		System.out.println("start init");
		
		ArrayList<StockInfo> stockInfo = adminServ.stockListInit();
		
		stockList.setCnt(stockInfo.size());
		stockList.setStocks_list(stockInfo);
		
		HashMap<String, StockInfo> stocks = new HashMap<>();
		for(StockInfo sinfo : stockInfo){
			stocks.put(sinfo.getCode(), sinfo);
		}
		stockList.setStocks(stocks);
		
		System.out.println(stockInfo.size());
		
		/*RedisUpdateThread thread = new RedisUpdateThread();
		workExecutor.execute(thread);*/
	}

}
