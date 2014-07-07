package com.futor.redis.utils;

import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

public class RedisUtils {
	
	
	private static JedisConnectionFactory jcf = null;
	
	
	public static JedisConnectionFactory getConnectionFactory() { //TODO: use to singleton pattern

		if(jcf ==null) {
			System.out.println("Setting connection factory!");
			JedisConnectionFactory factory = new JedisConnectionFactory();
			factory.setUsePool(true);
			factory.setPort(6379);
			factory.setHostName("54.203.244.212");
			factory.setDatabase(10);
			factory.afterPropertiesSet();
		} 
		return jcf;
	}
}
