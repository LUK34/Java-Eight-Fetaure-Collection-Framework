package com.java.collections.interfaces.iterations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorExample 
{
	public static void main(String[] args)
	{
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("################################# ITERATOR IN LIST #########################################");
		System.out.println("------------------------------------------------------------------------------------------");
		List<String> fruits= new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Cherry");
		fruits.add("Banana");
		
		Iterator<String> it=fruits.iterator();
		while(it.hasNext()) 
		{
			String fruit= (String) it.next();
			System.out.println(fruit);

			if("Banana".equals(fruit)) 
			{
			  it.remove();	
			}
		}
		System.out.println(fruits);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("################################# ITERATOR IN SET #########################################");
		System.out.println("------------------------------------------------------------------------------------------");
		Set<String> fru= new HashSet<String>();
		fru.add("Apple");
		fru.add("Mango");
		fru.add("Cherry");
		fru.add("Banana");
		Iterator<String> its=fru.iterator();
		while(its.hasNext()) 
		{
			String frus = (String) its.next();
			System.out.println(frus);
			if("Apple".equals(frus))
			{
				its.remove();
			}
		}
		System.out.println(fru);
	}

}
