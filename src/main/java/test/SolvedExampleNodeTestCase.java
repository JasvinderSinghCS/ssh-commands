package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.futor.bo.ContentNodeBO;
import com.futor.content.domain.DomainObject;
import com.futor.content.domain.SolvedExampleNode;

public class SolvedExampleNodeTestCase {
	
	public static void main(String[] args) {
		DomainObject obj1= new SolvedExampleNode();
		obj1.setObjectType("SOLVED_EXAMPLE");
		obj1.setNodeType("base");
		obj1.setContentType("solvedExample");
		obj1.setDomain("1");
		obj1.setPropType("meta");
		obj1.setFile_path("http:xyz");
		obj1.setVideo_url("http:xyz");
		obj1.setSolvedConceptNotes("gghj");
		obj1.setContent_url("gdhgf");
		
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-redis-db.xml");
		ContentNodeBO contentNodeBO  = (ContentNodeBO ) context.getBean("contentNodeBO");
		contentNodeBO.add(obj1);
	}
}
