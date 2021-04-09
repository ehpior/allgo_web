package com.allgo.web.redis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
	@Autowired
    private RedisCacheService redis;
    
    @RequestMapping("/test")
    public List<User> getUsers() {//Welcome page, non-rest
        return testCacheService.getUsers();
    }

    @RequestMapping("/test-refresh")
    public List<User> refreshUsers() {//Welcome page, non-rest
        testCacheService.removeCacheUsers();
        return testCacheService.getUsers();
    }
}
