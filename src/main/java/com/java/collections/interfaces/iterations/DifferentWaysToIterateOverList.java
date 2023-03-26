package com.java.collections.interfaces.iterations;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverList
{
	public static void main(String[] args)
	{
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("################################# ITERATIONS IN LIST ######################################");
		System.out.println("------------------------------------------------------------------------------------------");
		List<String> crs= Arrays.asList("C","C++","Java","Python","Spring","Hibernate");
		System.out.println("Using Basic for loop");
		for(int i=0;i<crs.size();i++)
		{
			System.out.println(crs.get(i));
		}
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Using Enhanced for each loop");
		for(String c1:crs)
		{
			System.out.println(c1);
		}
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Using Iterator with basic loop");
		for(Iterator i = crs.iterator(); i.hasNext();)
		{
			String c2 = (String) i.next();
			System.out.println(c2);
		}
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Using Iterator with while loop");
		Iterator i=crs.iterator();
		while(i.hasNext())
		{
			String c2 = (String) i.next();
			System.out.println(c2);
		}
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Using Java 8 stream + Lambda expression");
		crs.stream().forEach( c2->System.out.println(c2) );
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Using Java 8 forEach + Lambda expression");
		crs.forEach( c2->System.out.println(c2) );
		
	}	
}
