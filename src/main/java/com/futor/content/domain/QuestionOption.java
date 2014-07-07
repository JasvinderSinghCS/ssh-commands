package com.futor.content.domain;

import org.codehaus.jackson.annotate.JsonIgnore;


public class QuestionOption  {

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	private int id;
	private FutorImage imageInfo;
	public FutorImage getImageInfo() {
		return imageInfo;
	}

	public void setImageInfo(FutorImage imageInfo) {
		this.imageInfo = imageInfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String option_text=null;

	private short isCorrectOption;


	public QuestionOption() {

		super();
	}
	@JsonIgnore
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}
	@JsonIgnore
	public String getObjectKey() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getOption_text() {
		return option_text;
	}

	public short getIsCorrectOption() {
		return isCorrectOption;
	}

	public void setIsCorrectOption(short isCorrectOption) {
		this.isCorrectOption = isCorrectOption;
	}

	public void setOption_text(String option_text) {
		this.option_text = option_text;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
