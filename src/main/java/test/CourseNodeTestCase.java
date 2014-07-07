package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.futor.bo.ContentNodeBO;
import com.futor.content.domain.Course;
import com.futor.content.domain.DomainObject;

public class CourseNodeTestCase {
	public static void main(String[] args) {
		
	
	System.out.println("main method start");
	DomainObject obj1 = new Course();
	obj1.setObjectType("COURSE");
	obj1.setContentType("courses");
	obj1.setDomain("1");
	obj1.setPropType("meta");
	obj1.setName("course_name121");
	obj1.setCode("9_abc_123");
	obj1.setStatus("1");

	ApplicationContext context= new ClassPathXmlApplicationContext("spring-redis-db.xml");
	ContentNodeBO contentNodeBO  = (ContentNodeBO ) context.getBean("contentNodeBO");
	contentNodeBO.add(obj1);
	}
	}

