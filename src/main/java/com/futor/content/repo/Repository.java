package com.futor.content.repo;

import java.util.List;

import com.futor.content.domain.ContentNode;
import com.futor.content.domain.DomainObject;

public interface Repository<V extends DomainObject > {

	
	public void add(V obj); // this method takes the FULL Object and persists the object into DB
	
	public void put(V obj); // this method gets the Object from DB, replaces supplied values and set into the Object and then persists the Object into DB.

	public V get(V key);
	
	public V get(String key);

	public void delete(V key);

	public void delete(String key);
	
	public List<V> getObjects(String partailKey);
	
	public List<V> getObjects(V obj);
	
	public boolean keyExists(V obj); // the method checks the existence of key in DB
	
	public boolean keyExists(String key); // the method checks the existence of key in DB
	
	public V getBasedOnUiqueIdentifier(V obj); // get the Object based on the unique Identified
	
	public boolean areEqual(DomainObject obj1, DomainObject obj2);
}