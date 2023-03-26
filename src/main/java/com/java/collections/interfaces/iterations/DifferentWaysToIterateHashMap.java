package com.java.collections.interfaces.iterations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DifferentWaysToIterateHashMap 
{
	public static void main(String[] args)
	{
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("################################# ITERATIONS IN HASH MAP ##################################");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Iterate through HashMap EntrySet using Iterator");
		Map<Integer,String> cm = new HashMap<Integer, String>();
		cm.put(1, "C");
		cm.put(2, "C++");
		cm.put(3, "Java");
		cm.put(4, "Spring Framework");
		cm.put(5, "Hibernate ORM Framework");
		
		Iterator<Entry<Integer, String>> i = cm.entrySet().iterator();
		while(i.hasNext()) 
		{
			Entry<Integer,String> e = i.next();
			System.out.println(e.getKey() + " -> " + e.getValue());
		}
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Iterate through HashMap KeySet using Iterator");
		Iterator<Integer> i1 = cm.keySet().iterator();
		while(i1.hasNext()) 
		{
			Integer k = i1.next();
			System.out.println(k + " -> "+ cm.get(k));
		}
				
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Iterate through HashMap KeySet using For-Each Loop Iterator");
		for(Map.Entry<Integer, String> e2: cm.entrySet()) 
		{
			System.out.println(e2.getKey()+" -> "+e2.getValue());
		}
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Iterate through HashMap using Lambda Expressions");
		cm.forEach( (key,value) -> {System.out.println(key + " -> " + value);});
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Iterate through HashMap using Stream API + forEach + Lambda expression ");
		cm.entrySet().stream().forEach( (e) -> { System.out.println(e.getKey() + " -> " + e.getValue()); } );
		
	}
	
}
