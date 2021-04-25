package com.allgo.web.redis;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.allgo.web.dto.StockInfo;
import com.allgo.web.dto.StockList;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service("redisService")
public class RedisService {
	
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
	
	public void checkAll(){
		
		try{
			HashMap<String, StockInfo> stocks = stockList.getStocks();
			
			for(String code : stocks.keySet()){
				float price = stocks.get(code).getPrice();
				
				if(price > 0){
					System.out.println(code+" : "+String.valueOf(price));
				}
			}
			
		} catch(Exception e){
			System.out.println("checkAll");
			System.out.println(e);
		}
		
	}

	//https://victorydntmd.tistory.com/248

	/*public List<Sensor> getSensor() {

		RedisOperations<String, String> redis = listOps.getOperations();

		Set<String> keys = redis.keys("sensor*");

		Iterator<String> iter = keys.iterator();

		List<Sensor> sensorList = new ArrayList<Sensor>();

		while (iter.hasNext()) {
			String key = iter.next().toString();
			int size = (int) (long) redis.opsForList().size(key);
			for (int i = 0; i < size; i++) {
				Sensor sensor = new Sensor();
				String[] value = redis.opsForList().leftPop(key).split("_");
				sensor.setDeviceName(key);
				sensor.setValue(value[0]);
				sensor.setRegTime(value[1]);
				sensor.setCate(value[2]);
				sensorList.add(sensor);
			}
		}
		return sensorList;
	}*/
	
	
	public <T> T getData(String key, Class<T> classType) throws Exception {
		String jsonResult = (String) redisTemplate.opsForValue().get(key);
		if (StringUtils.isEmpty(jsonResult)){
			return null;
		} else{
			ObjectMapper mapper = new ObjectMapper();
			T obj = mapper.readValue(jsonResult, classType);
			return obj;
		}
	}
}
