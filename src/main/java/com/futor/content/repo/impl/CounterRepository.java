package com.futor.content.repo.impl;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JacksonJsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.futor.redis.utils.RedisServerException;

public class CounterRepository {
	/*
	@Autowired
	private RedisConnectionFactory connectionFactory;
	
	private RedisTemplate<String,AtomicLong> redisTemplate;

	@Autowired
	public CounterRepository(RedisTemplate<String,AtomicLong> redisTemplate){
		this.redisTemplate = new RedisTemplate<String,AtomicLong>();
		this.redisTemplate.setConnectionFactory(redisTemplate.getConnectionFactory());
		this.redisTemplate.setKeySerializer( new StringRedisSerializer() );
		this.redisTemplate.afterPropertiesSet();
	}
*/
	
//	@Autowired
	private RedisTemplate<String,AtomicLong> redisTemplate;

	public RedisTemplate<String,AtomicLong> getRedisTemplate() {
		return redisTemplate;
	}
	
	public CounterRepository() {
		try {
			init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected JedisConnectionFactory getConnectionFactory() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setUsePool(true);
		factory.setPort(6379);
		factory.setHostName("54.203.244.212");
		factory.setDatabase(9);
		factory.afterPropertiesSet();
		return factory;

	}
	
	private void init() throws RedisServerException { 
		try {
			redisTemplate = new RedisTemplate<String,AtomicLong>();
			redisTemplate.setConnectionFactory(this.getConnectionFactory());
			redisTemplate.setKeySerializer( new StringRedisSerializer() );
			redisTemplate.setValueSerializer( new JacksonJsonRedisSerializer< AtomicLong >(AtomicLong.class) );
			redisTemplate.afterPropertiesSet();
		} catch (Exception anyException ) {
			throw new RedisServerException(anyException.getMessage());
	    }
	}

	
	public Long incrementCounter(String counterName){
		AtomicLong countervalue = redisTemplate.opsForValue().get(counterName);
		//TODO:move to initialization to avoid the NULL check every time
		if(countervalue==null)
			redisTemplate.opsForValue().set(counterName, new AtomicLong(1));
		else
			redisTemplate.opsForValue().set(counterName,new AtomicLong(countervalue.incrementAndGet()));
		
		return redisTemplate.opsForValue().get(counterName).get();
	}
	
	public Long getCurrentCounter(String counterName){
		return  redisTemplate.opsForValue().get(counterName).get();
	}

}
