package com.allgo.web.redis;

import java.util.Iterator;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.allgo.web.dto.StockList;

@EnableScheduling
@Configuration
//public class RedisUpdateThread implements Runnable{
public class RedisUpdateThread{
	
	@Autowired
	RedisTemplate<String, Object> redisTemplate;

	@Resource(name="redisTemplate")
	private ValueOperations<String, String> valueOps;

	@Resource(name="redisTemplate")
	private SetOperations<String, String> setOps;

	@Resource(name="redisTemplate")
	private ListOperations<String, Object> listOps;

	@Resource(name="redisTemplate")
	private ZSetOperations<String, String> zSetOps;

	@Resource(name="redisTemplate")
	private HashOperations<String, String, Object> hashOps;
	
	@Autowired
	StockList stockList;

	@Scheduled(fixedDelay = 5000, initialDelay = 3000) 
	private void scheduleTest(){ 
		Set<String> keys = redisTemplate.keys("stock:*");
			
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()){
			try{
				String key = iter.next().toString();
				
				String code = key.split(":")[1];
				float price = Float.parseFloat(valueOps.get(key));
				
				if(stockList.getStocks().containsKey(code)){
					stockList.getStocks().get(code).setPrice(price);
				}
			} catch(Exception e){
				System.out.println("update");
				System.out.println(e);
			}
		}
	}
	
}
