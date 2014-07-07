package com.futor.content.domain;

import java.util.HashMap;

import org.codehaus.jackson.annotate.JsonIgnore;

public class Question extends DomainObject {

	@JsonIgnore
	private String desc;
	@JsonIgnore
	private String displayName;
	@JsonIgnore
	private String status;
	@JsonIgnore
	private String studyDuration;
	@JsonIgnore
	private String nodeType;
	@JsonIgnore
	private String question_text ;
	@JsonIgnore
	private FutorImage imagePath ;
	@JsonIgnore
	private HashMap<String,QuestionOption> qoptionContent ;
	@JsonIgnore
	private int id;
	@JsonIgnore
	private FutorImage imageInfo;
	@JsonIgnore
	private String option_text ;
	@JsonIgnore
	private short isCorrectOption;
	@JsonIgnore
	private String url_source ;
	@JsonIgnore
	private Question quesObj ;
	@JsonIgnore
	private String key;
	@JsonIgnore
	private String code;
	@JsonIgnore
	private String domain;
	@JsonIgnore
	private String propType;
	@JsonIgnore
	private String mysqlId;
	@JsonIgnore
	public String objectType;
	@JsonIgnore
	private String objType;
	@JsonIgnore
	private String concept_notes;
	@JsonIgnore
	private String content_url;
	@JsonIgnore
	private String video_url;
	@JsonIgnore
	private String file_path;
	@JsonIgnore
	private String solvedConceptNotes;
	@JsonIgnore
	private String video_code;
	@JsonIgnore
	private String audio_video_issue;
	@JsonIgnore
	private String editing_issue;
	@JsonIgnore
	private String content_mismatch_issue;
	@JsonIgnore
	private String is_video_deleted;
	@JsonIgnore
	private String tagging_error;
	@JsonIgnore
	private String no_error;
	@JsonIgnore
	private String complexity_level;
	@JsonIgnore
	private String instruction_Duration;
	@JsonIgnore
	private String  priority;
	@JsonIgnore
	public String getObjectKey(){
		return objType;
	}
	
}