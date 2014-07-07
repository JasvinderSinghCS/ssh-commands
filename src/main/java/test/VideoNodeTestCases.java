package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.futor.bo.ContentNodeBO;
import com.futor.content.domain.DomainObject;
import com.futor.content.domain.VideoNode;

public class VideoNodeTestCases {
	public static void main(String[] args) {
		DomainObject obj2 = new VideoNode();
		obj2.setObjectType("VIDEO");
		obj2.setContentType("video");
		obj2.setDomain("1");
		obj2.setPropType("meta");
		obj2.setFlag("1");
		obj2.setAudio_video_issue("xyx");
		obj2.setContent_mismatch_issue("abc");
		obj2.setEditing_issue("noerror");
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-redis-db.xml");
		ContentNodeBO contentNodeBO  = (ContentNodeBO ) context.getBean("contentNodeBO");
		contentNodeBO.add(obj2);
		}

}
