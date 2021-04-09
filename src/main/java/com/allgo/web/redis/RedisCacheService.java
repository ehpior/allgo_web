package com.allgo.web.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {
	
	@Autowired
	RedisTemplate redisTemplate;

    @Cacheable(cacheNames="foo")
    public String getUsers(){
    	
        return ;
    }

    @Caching(evict = {
            @CacheEvict(cacheNames="foo", allEntries = true)
        })
    public void removeCacheUsers(){
    }
    
}