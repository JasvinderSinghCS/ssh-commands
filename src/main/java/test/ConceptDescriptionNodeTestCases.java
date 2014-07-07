package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.futor.bo.ContentNodeBO;
import com.futor.content.domain.ConceptDescription;
import com.futor.content.domain.DomainObject;

public class ConceptDescriptionNodeTestCases {
	public static void main(String[] args) {
		DomainObject obj1= new ConceptDescription();
		obj1.setObjectType("CONCEPT_DESCRIPTION");
		obj1.setContentType("conceptDescription");
		obj1.setNodeType("base");
		obj1.setDomain("1");
		obj1.setPropType("meta");
		obj1.setFile_path("http:xyz");
		obj1.setVideo_url("http:xyz");
		obj1.setConcept_notes("gghj");
		obj1.setContent_url("xyzx");
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-redis-db.xml");
		ContentNodeBO contentNodeBO  = (ContentNodeBO ) context.getBean("contentNodeBO");
		contentNodeBO.add(obj1);
	}

}
