package com.futor.content.repo.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JacksonJsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.futor.content.domain.DomainObject;
import com.futor.content.repo.Repository;

public  class ContentNodeRepository implements Repository<DomainObject>{ // TODO: how to change SubjectNode to DomainObject
	
	
	@Autowired
	private RedisTemplate<String,DomainObject> redisTemplate;

	@Autowired
	public ContentNodeRepository( RedisTemplate<String,DomainObject> redisTemplate) {
		redisTemplate.setConnectionFactory(redisTemplate.getConnectionFactory());
		redisTemplate.setKeySerializer( new StringRedisSerializer() );
		redisTemplate.setValueSerializer( new JacksonJsonRedisSerializer< DomainObject >(DomainObject.class) );
		redisTemplate.afterPropertiesSet();
	}
	

	
	public void add(DomainObject obj) {
		// TODO Auto-generated method stub
		System.out.println(obj.getKey());
		redisTemplate.opsForValue().set(obj.getKey(), obj);
		
	}

	public void put(DomainObject obj) {
		DomainObject objFromDB = get(obj);
		
		if(objFromDB != null){
			System.out.println("==================");
			setObjectParams(objFromDB,obj);			
		}
		redisTemplate.opsForValue().set(obj.getKey(),objFromDB);
	}

	public DomainObject get(DomainObject obj) {
		// TODO Auto-generated method stub
		return redisTemplate.opsForValue().get(obj.getKey());
	}
	
	public DomainObject get(String key) {
		// TODO Auto-generated method stub
		return redisTemplate.opsForValue().get(key);
	}


	public void delete(DomainObject obj) {
		redisTemplate.opsForValue().getOperations().delete(obj.getKey());
	}
	
	public void delete(String key) {
		redisTemplate.opsForValue().getOperations().delete(key);
	}

	public boolean areEqual(DomainObject object1, DomainObject object2) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean keyExists(DomainObject obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean keyExists(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	public DomainObject getBasedOnUiqueIdentifier(DomainObject obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void setObjectParams(DomainObject objFromDB,DomainObject outsideObj){
		if(outsideObj.getCode() != null){
			objFromDB.setCode(outsideObj.getCode());
		}
		if(outsideObj.getVideo_code() != null){
			objFromDB.setVideo_code(outsideObj.getVideo_code());
		}
		if(outsideObj.getName() != null){
			objFromDB.setName(outsideObj.getName());
		}
		if(outsideObj.getStatus() != null){
			objFromDB.setStatus(outsideObj.getStatus());
		}
		if(outsideObj.getSource_node_code() != null){
			objFromDB.setSource_node_code(outsideObj.getSource_node_code());
		}	
		if(outsideObj.getBase_node_type() != null){
			objFromDB.setBase_node_type(outsideObj.getBase_node_type());
		}	
	}


	public List<DomainObject> getObjects(String partialKey) {
		// TODO Auto-generated method stub
		System.out.println("getObjects: method called:::::"+partialKey);
		Set<String> keys = redisTemplate.keys(partialKey+"*");
		System.out.println("keys::::::"+keys.size() +  " and :::::"+keys);
		List<DomainObject> list = new ArrayList<DomainObject>();
		if(keys != null){
			Iterator<String> itKeys = keys.iterator();
			while(itKeys.hasNext()){
				System.out.println("in while loop::::::::::::");
				String key = (String)itKeys.next();
				DomainObject obj = get(key);
				list.add(obj);
			}
		}
		return list;
	}
	
	public List<DomainObject> getObjects(DomainObject obj) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}