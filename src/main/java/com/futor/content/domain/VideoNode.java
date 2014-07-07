package com.futor.content.domain;

import java.util.HashMap;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.futor.utils.DomainConstants;

public class VideoNode extends DomainObject {
	
	
	 //ignore field of Concept node::::::::::::::::::::::::::::::::::::
    @JsonIgnore
    private String complexity_level;
    @JsonIgnore
    private String instruction_Duration;
    @JsonIgnore
    private String  priority;
    
  //ignore field of Solved Example node::::::::::::::::::::::::::::::::::
    @JsonIgnore
	private String SolvedConceptNotes;
    
    
  //ignore field of concept description::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	@JsonIgnore
	private String concept_notes;
	@JsonIgnore
	private String content_url;
	@JsonIgnore
	private String video_url;
	@JsonIgnore
	private String file_path;
	@JsonIgnore
	private String oldConceptCode;
	@JsonIgnore
	private String learningUnitCode;
	@JsonIgnore
	private String videoCodeStringFromSubjectTable;
	@JsonIgnore
	private String remarks;
	
	
	//ignore field of subject node::::::::::::::::::::::::::::::::::::::
	@JsonIgnore
	private String name;
	@JsonIgnore
	private String displayName;
	@JsonIgnore
	private String desc;
	@JsonIgnore
	private String status;
	@JsonIgnore
	private String code;
	@JsonIgnore
	private String moveContentStatus;
	
	//ignore field of content node::::::::::::::::::::::::::::
		@JsonIgnore
		private String studyDuration;
	
		
		//ignore field of common::::::::::::::::::::::::::::::::::::::::::::::::::::
		@JsonIgnore
		private String objType;
		@JsonIgnore
		private String objectType;
		@JsonIgnore
		private String domain;
		@JsonIgnore
		private String propType;
		@JsonIgnore
		private String solvedConceptNotes;
		@JsonIgnore
		private String objectKey;
		@JsonIgnore
		private String nodeType; 
		@JsonIgnore
		private String key;
		@JsonIgnore
		private String contentType;
		
		
		/********for question ********/
		@JsonIgnore
		private String mysqlId;
		@JsonIgnore
		private String base_node_type ;
		@JsonIgnore
		private String source_node_code ;
		@JsonIgnore
		private String question_type = DomainConstants.QUESTION_TYPE_MULTI_CHOICE;
		@JsonIgnore
		private QuestionContent qcontent ;
		
		/*******for RedisQuestionContent***********/

		@JsonIgnore
		private String question_text ;
		@JsonIgnore
		private FutorImage imagePath ;
		@JsonIgnore
		private HashMap<String,QuestionOption> qoptionContent ;
		
		
		/***************  RedisQuestionOptions **************/
		@JsonIgnore
		private int id;
		@JsonIgnore
		private FutorImage imageInfo;
		@JsonIgnore
		private String option_text ;
		@JsonIgnore
		private short isCorrectOption;
		
		/************* RedisFutorImage  ****************/
		@JsonIgnore
		private String url_source ;
		
		/**********adding questionDTO in domain object *********/

		@JsonIgnore
		private Question quesObj ;

	
	
	
}


