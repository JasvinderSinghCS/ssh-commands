package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.futor.bo.ContentNodeBO;
import com.futor.content.domain.DomainObject;
import com.futor.content.domain.SubjectNode;

public class SubjectNodeTestCases {
	public static void main(String args[]){
		System.out.println("main method start");
		DomainObject obj1 = new SubjectNode();
		obj1.setObjectType("GRADE");
		obj1.setContentType("grade");
		obj1.setDomain("1");
		obj1.setMoveContentStatus("1");
		obj1.setNodeType("content");
		obj1.setPropType("meta");
		obj1.setName("Grade_name");
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-redis-db.xml");
		ContentNodeBO contentNodeBO  = (ContentNodeBO ) context.getBean("contentNodeBO");
		contentNodeBO.add(obj1);
	}
}

