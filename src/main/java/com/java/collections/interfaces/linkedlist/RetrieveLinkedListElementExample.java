package com.java.collections.interfaces.linkedlist;

import java.util.LinkedList;

public class RetrieveLinkedListElementExample 
{
	public static void main(String[] args)
	{
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("################################# LINKED LIST DEMO: Retrieving elements from linked list ##########################################");
		System.out.println("------------------------------------------------------------------------------------------");
		LinkedList<String> fruit= new LinkedList<String>();
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Oranges");
		System.out.println("Inital values added are as follows => "+ fruit);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Getting first element from LinkedList using getFirst() method ");
		String firstElement=fruit.getFirst();	
		System.out.println(firstElement);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Getting last element from LinkedList using getLast() method ");
		String lastElement=fruit.getLast();	
		System.out.println(lastElement);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Getting the element at a given position ");
		String elemente=fruit.get(1);
		System.out.println(elemente);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("To display all elemenet in LinkedList ");
		for(String fru:fruit)
		{
			System.out.println(fru);
		}
		System.out.println("------------------------------------------------------------------------------------------");
		
		
		
	}

}
