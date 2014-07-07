package com.futor.bo;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.futor.content.domain.ContentNode;
import com.futor.content.domain.DomainObject;
import com.futor.content.repo.impl.ContentNodeRepository;
import com.futor.content.repo.impl.CounterRepository;
import com.futor.utils.KeyUtils;

public class ContentNodeBO {
	@Autowired
	ContentNodeRepository contentNodeRepository;
	public  void add(DomainObject obj){
		String objType = obj.getObjectType() + "_IDS";

		CounterRepository cp = new CounterRepository();
		Long id = cp.incrementCounter(objType);
		String nid = KeyUtils.keyMapper(obj.getObjectType()) + id;
		obj.setNid(nid);
		String nodeType=KeyUtils.getNodeType(obj.getContentType());
		obj.setNodeType(nodeType);
		String key = KeyUtils.getKey(obj.getDomain(),obj.getPropType(),obj.getNodeType(),obj.getContentType(),nid);
		obj.setKey(key);
	
		contentNodeRepository.add(obj);
	}


	public  void put(DomainObject obj) {
		contentNodeRepository.put(obj);
	}

	public  DomainObject get(DomainObject obj) {

		return contentNodeRepository.get(obj);
	}

	public  DomainObject get(String key) {		
		return contentNodeRepository.get(key);
	}

	public  void delete(DomainObject obj) {
		contentNodeRepository.delete(obj);
	}

	public  void delete(String key) {
		contentNodeRepository.delete(key);
	}
public static void main(String[] args) {
	System.out.println("in main method:::::");
	
	DomainObject obj=new DomainObject();
	obj.setDomain("domain#1");
	obj.setPropType("meta");
	obj.setNodeType("content");
	obj.setContentType("Course");
	obj.setCode("123");
	ApplicationContext context= new ClassPathXmlApplicationContext("spring-redis-db.xml");
	ContentNodeBO contentNodeBO  = (ContentNodeBO ) context.getBean("contentNodeBO");
	contentNodeBO.getBasedOnUniqueIdentifier(obj);
}
	public DomainObject getBasedOnUniqueIdentifier(DomainObject obj){
		System.out.println("in getBasedOnUniqueIdentifier method:::::::: ");
		String nodeType=KeyUtils.getNodeType(obj.getContentType());
		obj.setNodeType(nodeType);
		String partailKeys = KeyUtils.getPartialKey(obj.getDomain(),obj.getPropType(),obj.getNodeType(),obj.getContentType());
		System.out.println("partailKeys:::::::"+partailKeys);
		List<DomainObject> list = contentNodeRepository.getObjects(partailKeys);
		DomainObject objFromList = null;
		int i = 0;
		if(list != null ){
			System.out.println("list size:::::::::::::::"+list.size());
			Iterator<DomainObject> itr=list.iterator();
			while(itr.hasNext()){
				System.out.println(" in loop::::::::::::");
				objFromList = itr.next();
				objFromList = (DomainObject)list.get(i);
				System.out.println(objFromList.getCode());
				System.out.println(obj.getCode());
				if(objFromList.getCode().equals(obj.getCode())){
					System.out.println("successful");
					break;
				}else
					System.out.println("code not found");
				
			}
			

		}
		
		return objFromList;

	}
}
