package com.futor.utils;

public class CustomExceptions extends RuntimeException {

	private static final long serialVersionUID = 10012323L;
	public static final String REDIS_SERVER_DOWN = "Redis Server is down: " + "Date Time : " + 
	(new java.sql.Date(System.currentTimeMillis()).toString());
	
	public static final String MYSQL_SERVER_DOWN = "MySql Server is down: " + "Date Time : " + 
			(new java.sql.Date(System.currentTimeMillis()).toString());
	public static final String EXCEL_FILE_FORMAT_ERROR = "Excel File Format Error";
	public static final String LOG_FILE_CREATION_PROBLEM = "Log File creation problem";
	public static final String LOG_FILE_WRITE_PROBLEM = "Log File Writing Problem";
	public static final String FUTOR_CRUD_EXCEPTION = "Futor CRUD API Exception";
	public static final String NOT_AN_EXCEL_FILE_ERROR = "File is  not an Excel File!";
	
	
	public CustomExceptions(String message) {
		super(message);
	}
	
	public CustomExceptions( String message,Throwable cause) {
		super(message, cause);
	}
	
	public CustomExceptions(Throwable cause) {
		super(cause);
	}
	
	
	

}