package com.futor.content.domain;

import java.util.HashMap;
import org.codehaus.jackson.annotate.JsonIgnore;

public class QuestionContent   {

	private static final long serialVersionUID = 1L;
	private String question_text = null;
	private FutorImage imagePath ;
	private HashMap<String,QuestionOption> qoptionContent=null;

	public FutorImage getImagePath() {
		return imagePath;
	}

	public void setImagePath(FutorImage imagePath) {
		this.imagePath = imagePath;
	}

	public QuestionContent() {
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
	public String getQuestion_text() {
		return question_text;
	}
	public void setQuestion_text(String question_text) {
		this.question_text = question_text;
	}
	public HashMap<String, QuestionOption> getQoptionContent() {
		return qoptionContent;
	}
	public void setQoptionContent(HashMap<String, QuestionOption> qoptionContent) {
		this.qoptionContent = qoptionContent;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
