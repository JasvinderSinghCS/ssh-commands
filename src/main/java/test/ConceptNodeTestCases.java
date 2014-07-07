package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.futor.bo.ContentNodeBO;
import com.futor.content.domain.ConceptNode;
import com.futor.content.domain.DomainObject;

public class ConceptNodeTestCases {
	public static void main(String[] args) {
		DomainObject obj3 = new ConceptNode();
		obj3.setObjectType("CONCEPT");
		obj3.setContentType("concept");
		obj3.setDomain("1");
		obj3.setPropType("meta");
		obj3.setName("triangle");
		obj3.setStatus("1");
		obj3.setPriority("high");
		obj3. setCode("9_abc_123");
		obj3.setComplexity_level("high");
		obj3.setVideoCodeStringFromSubjectTable("123_abc_d");
		obj3.setInstruction_Duration("600000");
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-redis-db.xml");
		ContentNodeBO contentNodeBO  = (ContentNodeBO ) context.getBean("contentNodeBO");
		contentNodeBO.add(obj3);
		
		
	}
}
