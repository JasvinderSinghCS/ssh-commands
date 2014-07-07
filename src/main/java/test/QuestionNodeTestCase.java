package test;

import java.util.HashMap;
import com.futor.bo.ContentNodeBO;
import com.futor.content.domain.DomainObject;
import com.futor.content.domain.FutorImage;
import com.futor.content.domain.Question;
import com.futor.content.domain.QuestionContent;
import com.futor.content.domain.QuestionContent;
import com.futor.content.domain.QuestionOption;
import com.futor.utils.DomainConstants;

/**
 * Main Method for Question Node operation like addition ,deletion  
 * @author Pooja 
 *
 */
public class QuestionNodeTestCase {

	public static void main(String args[]){
		System.out.println("QuestionNodeTestCase.main method starts:::");

		DomainObject obj = new Question();
		obj.setObjectType("QUESTION");
		obj.setNodeType("base");
		obj.setDomain("1");
		obj.setPropType("meta");
		obj.setName("ques_name");
		//aQuestion.setMysqlId(String.valueOf(questionInfo.getId()));
		obj.setCode("ques_code");
		obj.setBase_node_type("base_node_type");
		obj.setSource_node_code("source_node_code");
		obj.setQuestion_type(DomainConstants.QUESTION_TYPE_MULTI_CHOICE);

		QuestionContent aqc = new QuestionContent();
		aqc.setQuestion_text("ques_text");
		FutorImage qrfi = new FutorImage();
		qrfi.setUrl_source("ques_image");
		aqc.setImagePath(qrfi);

		//ArrayList<MySqlQuestionOptions> questionOptionInfo = (ArrayList<MySqlQuestionOptions>)list.get(1);
		HashMap<String,QuestionOption> hmQoption = new HashMap<String,QuestionOption>();
		int count=1;

		//for(MySqlQuestionOptions optionDto : questionOptionInfo){
		QuestionOption rqo =new QuestionOption();
		rqo.setId(1);
		rqo.setOption_text("option_text");
		rqo.setIsCorrectOption((short)1);
		FutorImage oprfi = new FutorImage();
		oprfi.setUrl_source("option_image");
		rqo.setImageInfo(oprfi);

		hmQoption.put("option_"+count,rqo);
		count++;
		//}
		aqc.setQoptionContent(hmQoption);
		obj.setQcontent(aqc);

		System.out.println("ADD method starts:::");
		//ContentNodeBO.add(obj);
		System.out.println("ADD method ends:::::");
		
		System.out.println("GET method starts:::");
		obj.setKey("domain#1:base:meta:nid#qu5");
		//obj=ContentNodeBO.get(obj);
		System.out.println("NAME::::" +obj.getName()+ "BASE NODE TYPE: " + obj.getBase_node_type());
		System.out.println("GET method ends:::::");
		
		System.out.println("PUT method starts:::::");
		obj.setKey("domain#1:base:meta:nid#qu6");
		obj.setName("name_new");
		obj.setBase_node_type("base_node_type_new");
		//ContentNodeBO.put(obj);
		System.out.println("Name New:"+obj.getName()+ "Base Node Name: " +obj.getBase_node_type());
		System.out.println("PUT method ends:::::");
		
		System.out.println("DELETE method starts:::::");
		obj.setKey("domain#1:base:meta:nid#qu5");
		//ContentNodeBO.delete(obj);
		System.out.println("DELETE method ends:::::");

		System.out.println("QuestionNodeTestCase.main method ends:::");
	}

}
