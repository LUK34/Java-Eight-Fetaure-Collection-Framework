package com.java.collections.interfaces.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class SearchedIterationLinkedListExample
{
	public static void main(String[] args)
	{
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("################################# LINKED LIST DEMO: Searching and Iteration ##########################################");
		System.out.println("------------------------------------------------------------------------------------------");
		LinkedList<String> pl=new LinkedList<>();
		pl.add("C");
		pl.add("C++");
		pl.add("Core Java");
		pl.add("Java EE");
		pl.add("Spring Framework");
		pl.add("Hibernate Framework");
		pl.add("Core Java");
		System.out.println("Linked List to check whether it contains the element using contains()");
		boolean result= pl.contains("Core Java");
		System.out.println("Index= " + result);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Find the index of first occurence of Linked List");
		int index=pl.indexOf("Core Java");
		System.out.println("First occurence of index=>"+index);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Find the index of last occurence of Linked List");
		int lastindex=pl.lastIndexOf("Core Java");
		System.out.println("Last occurence of index=>"+lastindex);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Looping mechanisms of Linked List are as follows");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("ITERATOR LOOPING MECHANISM");
		Iterator<String> il=pl.iterator();
		while(il.hasNext())
		{
		
			String prag= (String) il.next();
			System.out.println(prag);
		}
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("forEach() LOOPING MECHANISM");
		pl.forEach((element)->System.out.println(element));
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("FOR EACH ADVANCE LOOPING MECHANISM");
		for(String e: pl) 
		{
			System.out.println(e);
		}
		System.out.println("------------------------------------------------------------------------------------------");		
	}

}
