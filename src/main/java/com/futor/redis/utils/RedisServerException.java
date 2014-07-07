package com.futor.redis.utils;

import com.futor.utils.CustomExceptions;


public class RedisServerException extends CustomExceptions {

	private static final long serialVersionUID = 10033232112323L;

	public RedisServerException(String message) {
		super(message);
	}

	public RedisServerException( String message,Throwable cause) {
		super(message, cause);
	}

	public RedisServerException(Throwable cause) {
		super(cause);
	}
}