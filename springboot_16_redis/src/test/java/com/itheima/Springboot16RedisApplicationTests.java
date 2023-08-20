package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest
class Springboot16RedisApplicationTests {

	@Autowired
	private RedisTemplate<String,String> redisTemplate;
	@Test
	void set() {

		ValueOperations ops = redisTemplate.opsForValue();
		ops.set("age",18);
	}

	@Test
	public void testGet(){
		ValueOperations ops = redisTemplate.opsForValue();
		Object value = ops.get("name");
		System.out.println(value);
	}

	@Test
	public void hset(){
		HashOperations ops = redisTemplate.opsForHash();
		ops.put("info","a","aa");
	}

	@Test
	public void hget(){
		HashOperations ops = redisTemplate.opsForHash();
		System.out.println(ops.get("info", "a"));
	}

}
