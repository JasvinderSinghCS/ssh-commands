package com.futor.utils;

public class KeyUtils {
	public static String keyMapper(String objType){
		String key = null;
		if(ContentConstants.COURSE.equalsIgnoreCase(objType)){
			key = ContentConstants.CO;
		}else if(ContentConstants.SUBJECT.equalsIgnoreCase(objType)){
			key = ContentConstants.SB;
		}else if(ContentConstants.GRADE.equalsIgnoreCase(objType)){
			key = ContentConstants.GR;
		}else if(ContentConstants.EXAM.equalsIgnoreCase(objType)){
			key = ContentConstants.EX;
		}else if(ContentConstants.CATEGORY.equalsIgnoreCase(objType)){
			key = ContentConstants.CA;
		}  else if(ContentConstants.TOPIC.equalsIgnoreCase(objType)){
			key = ContentConstants.TO;
		}else if(ContentConstants.CONCEPT_DESCRIPTION.equalsIgnoreCase(objType)){
			key = ContentConstants.CD;
		}else if(ContentConstants.SOLVED_EXAMPLE.equalsIgnoreCase(objType)){
			key = ContentConstants.SE;
		}else if(ContentConstants.VIDEO.equalsIgnoreCase(objType))
			key = ContentConstants.VD;
		else if(ContentConstants.CONCEPT.equalsIgnoreCase(objType)){
			key = ContentConstants.CP;
		}else if(BaseConstants.QUESTION.equalsIgnoreCase(objType)){
			key = BaseConstants.QU;
		}else if(ContentConstants.STRAND.equalsIgnoreCase(objType))
			key = ContentConstants.SR;
		return key;
	}

	public static String getKey(String domain,String propType,String nodeType,String contentType,String nId){
		return "domain#"+domain+ ":"+nodeType+":"+ propType +":"+contentType+":nid#"+nId;
	
	}
	
	public static String getPartialKey(String domain,String propType,String nodeType,String contentType){
		return "domain#" +domain+":"+nodeType+":"+ propType +":"+contentType;
	
	}
	public static String getNodeType(String contentType){
		if(ContentConstants.VIDEO.equalsIgnoreCase(contentType)){
			return "base.node";
			
		}
		else	if(ContentConstants.CONCEPT_DESCRIPTION.equalsIgnoreCase(contentType)){
			return "base.node";
			
		}
		else	if(ContentConstants.SOLVED_EXAMPLE.equalsIgnoreCase(contentType)){
			return "base.node";
			
		}
		else	 if(ContentConstants.COURSE.equalsIgnoreCase(contentType)){
			return "content.node";
			
		}
		else	if(ContentConstants.GRADE.equalsIgnoreCase(contentType)){
			return "content.node";
			
		}
		else	if(ContentConstants.EXAM.equalsIgnoreCase(contentType)){
			return "content.node";
			
		}
		else if(ContentConstants.SUBJECT.equalsIgnoreCase(contentType)){
			return "content.node";
			
		}
		else	 if(ContentConstants.CONCEPT.equalsIgnoreCase(contentType)){
			return "content.node";
			
		}
		else	if(ContentConstants.TOPIC.equalsIgnoreCase(contentType)){
			return "content.node";
			
		}
		else if(ContentConstants.CATEGORY.equalsIgnoreCase(contentType)){
			return "content.node";
			
		}
		else if(ContentConstants.STRAND.equalsIgnoreCase(contentType)){
			return "content.node";
			
		}
		return null;
	}

}
