package com.java.collections.interfaces.hashset;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableHashMap 
{
	public static void main(String[] args)
	{
		Map<String,String> fruits= new HashMap<String,String>();
		fruits.put("1","Apple");
		fruits.put("2","Mango");
		fruits.put("3","Watermelon");
		
		fruits=Collections.unmodifiableMap(fruits);
		fruits.put("4","Strawberry");
	}

}
