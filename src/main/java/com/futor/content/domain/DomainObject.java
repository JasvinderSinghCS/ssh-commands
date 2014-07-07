package com.futor.content.domain;

import java.io.Serializable;
import java.util.HashMap;

import com.futor.utils.DomainConstants;


public class DomainObject implements Serializable {

	//common field in all node:::::::::::::::::::
	private String nodeType; 
	private String key;
	private String objType;
	private String nid;
	private String domain;
	private String propType;
	private String contentType;
	
	
	


	



	//field of content node:::::::::::::::::
	private String studyDuration;
	//field of Concept Description:::::::::::::::::::::::::::::
	private String concept_notes;
	private String content_url;
	private String video_url;
	private String file_path;
	
	
	//field of solved example:::::::::::::::::::::::::::::::
	private String SolvedConceptNotes;
	
	
	//fields of video node:::::::::::::::::::::::::::::::::::::::::::::
	private String video_code;
	private String audio_video_issue;
	private String editing_issue;
    private String content_mismatch_issue;
    private String is_video_deleted;
    private String tagging_error;
    private String no_error;
    private String flag;
    
    
    //field of concept node:::::::::::::::::::::::::::::::::
    private String complexity_level;
	private String instruction_Duration;
	private String  priority;
	private String oldConceptCode;
	private String learningUnitCode;
	private String videoCodeStringFromSubjectTable;
	private String remarks;
	
	
	
	//field of subject node::::::::::::::
	private String code;
	private String name;
	private String status;
	private String moveContentStatus;
	
	
	public String getNodeType() {
		return nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}
	public String getComplexity_level() {
		return complexity_level;
	}

	public void setComplexity_level(String complexity_level) {
		this.complexity_level = complexity_level;
	}

	public String getInstruction_Duration() {
		return instruction_Duration;
	}

	public void setInstruction_Duration(String instruction_Duration) {
		this.instruction_Duration = instruction_Duration;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getVideo_code() {
		return video_code;
	}

	public void setVideo_code(String video_code) {
		this.video_code = video_code;
	}

	public String getAudio_video_issue() {
		return audio_video_issue;
	}

	public void setAudio_video_issue(String audio_video_issue) {
		this.audio_video_issue = audio_video_issue;
	}

	public String getEditing_issue() {
		return editing_issue;
	}

	public void setEditing_issue(String editing_issue) {
		this.editing_issue = editing_issue;
	}

	public String getContent_mismatch_issue() {
		return content_mismatch_issue;
	}

	public void setContent_mismatch_issue(String content_mismatch_issue) {
		this.content_mismatch_issue = content_mismatch_issue;
	}

	public String getIs_video_deleted() {
		return is_video_deleted;
	}

	public void setIs_video_deleted(String is_video_deleted) {
		this.is_video_deleted = is_video_deleted;
	}

	public String getTagging_error() {
		return tagging_error;
	}

	public void setTagging_error(String tagging_error) {
		this.tagging_error = tagging_error;
	}

	public String getNo_error() {
		return no_error;
	}

	public void setNo_error(String no_error) {
		this.no_error = no_error;
	}

	public String getSolvedConceptNotes() {
		return SolvedConceptNotes;
	}

	public void setSolvedConceptNotes(String solvedConceptNotes) {
		SolvedConceptNotes = solvedConceptNotes;
	}

	public String getConcept_notes() {
		return concept_notes;
	}

	public void setConcept_notes(String concept_notes) {
		this.concept_notes = concept_notes;
	}

	public String getContent_url() {
		return content_url;
	}

	public void setContent_url(String content_url) {
		this.content_url = content_url;
	}

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	public String getFile_path() {
		return file_path;
	}

	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}

	public String getKey(){
		return key;
	}
	
	public void setKey(String key){
		this.key = key;
	}

	public String getObjectKey(){
		return objType;
	}
	
	public void setObjectKey(String key){
		this.key = key;
	}
	
	public String getCode(){
		return code;
	}
	
	public void setCode(String code){
		this.code = code;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	
	public String getStatus(){
		return status;
	}
	
	public void setStatus(String status){
		this.status = status;
	}
	
	public String getObjectType(){
		return objType;
	}
	
	public void setObjectType(String objType){
		this.objType = objType;
	}
	
	public String getNid(){
		return nid;
	}
	
	public void setNid(String nid){
		this.nid = nid;
	}
	
	public String getDomain(){
		return domain;
	}
	
	public void setDomain(String domain){
		this.domain = domain;
	}
	
	public String getPropType(){
		return propType;
	}
	
	public void setPropType(String propType){
		this.propType = propType;
	}
	
	public String getStudyDuration(){
		return studyDuration;
	}

	public void setStudyDuration(String studyDuration){
		this.studyDuration = studyDuration;
	}
	
	
	
	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getOldConceptCode() {
		return oldConceptCode;
	}

	public void setOldConceptCode(String oldConceptCode) {
		this.oldConceptCode = oldConceptCode;
	}

	public String getLearningUnitCode() {
		return learningUnitCode;
	}

	public void setLearningUnitCode(String learningUnitCode) {
		this.learningUnitCode = learningUnitCode;
	}

	public String getVideoCodeStringFromSubjectTable() {
		return videoCodeStringFromSubjectTable;
	}

	public void setVideoCodeStringFromSubjectTable(
			String videoCodeStringFromSubjectTable) {
		this.videoCodeStringFromSubjectTable = videoCodeStringFromSubjectTable;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getMoveContentStatus() {
		return moveContentStatus;
	}

	public void setMoveContentStatus(String moveContentStatus) {
		this.moveContentStatus = moveContentStatus;
	}
	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}


	/********for question ********/

	private String mysqlId;
	private String base_node_type ;
	private String source_node_code ;
	private String question_type = DomainConstants.QUESTION_TYPE_MULTI_CHOICE;
	private QuestionContent qcontent ;


	public String getBase_node_type() {
		return base_node_type;
	}

	public void setBase_node_type(String base_node_type) {
		this.base_node_type = base_node_type;
	}

	public String getSource_node_code() {
		return source_node_code;
	}

	public void setSource_node_code(String source_node_code) {
		this.source_node_code = source_node_code;
	}

	public String getQuestion_type() {
		return question_type;
	}

	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}

	public QuestionContent getQcontent() {
		return qcontent;
	}

	public void setQcontent(QuestionContent qcontent) {
		this.qcontent = qcontent;
	}

	public String getMysqlId() {
		return  mysqlId;
	}

	public void setMysqlId(String mysqlId) {
		this.mysqlId = mysqlId;
	}




	/*******for RedisQuestionContent***********/


	private String question_text ;
	private FutorImage imagePath ;
	private HashMap<String,QuestionOption> qoptionContent ;

	public FutorImage getImagePath() {
		return imagePath;
	}

	public void setImagePath(FutorImage imagePath) {
		this.imagePath = imagePath;
	}

	public String getQuestion_text() {
		return question_text;
	}
	public void setQuestion_text(String question_text) {
		this.question_text = question_text;
	}
	public HashMap<String,QuestionOption> getQoptionContent() {
		return qoptionContent;
	}
	public void setQoptionContent(HashMap<String,QuestionOption> qoptionContent) {
		this.qoptionContent = qoptionContent;
	}





	/***************  RedisQuestionOptions **************/

	private int id;
	private FutorImage imageInfo;
	private String option_text ;
	private short isCorrectOption;

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



	/************* RedisFutorImage  ****************/

	private String url_source ;

	public String getUrl_source() {
		return url_source;
	}

	public void setUrl_source(String url_source) {
		this.url_source = url_source;
	}

	/**********adding questionDTO in domain object *********/


	private Question quesObj ;

	public Question getQuesObj() {
		return quesObj;
	}

	public void setQuesObj(Question quesObj) {
		this.quesObj = quesObj;
	}

}		