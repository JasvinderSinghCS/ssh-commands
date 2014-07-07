package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.futor.bo.ContentNodeBO;
import com.futor.content.domain.ContentNode;
import com.futor.content.domain.DomainObject;

public class ContentNodeTestCases {
	public static void main(String args[]){
		System.out.println("contentNodeTest.main method starts:::");
		DomainObject obj = new ContentNode();
		obj.setObjectType("CATEGORY");
		obj.setContentType("category");
		obj.setNodeType("content");
		obj.setDomain("1");
		obj.setPropType("meta");
		obj.setName("category_name122342");
		obj.setStudyDuration("600000000");
		
	ApplicationContext context= new ClassPathXmlApplicationContext("spring-redis-db.xml");
	ContentNodeBO contentNodeBO  = (ContentNodeBO ) context.getBean("contentNodeBO");
	contentNodeBO.add(obj);
	
	}
	  
		
}
