package com.java.collections.interfaces.linkedlist;

import java.util.LinkedList;

public class CreateLinkedListExample 
{
	public static void main(String[] args)
	{
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("################################# LINKED LIST DEMO ##########################################");
		System.out.println("------------------------------------------------------------------------------------------");
		LinkedList<String> fruit= new LinkedList<String>();
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Oranges");
		System.out.println("Inital values added are as follows => "+ fruit);	
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Adding element to a specified position in liked list:");
		fruit.add(2,"Watermelon");
		System.out.println("After adding watermelon using add(key,value) the output is as follow =>" + fruit);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Adding element at the begining of the linked list:");
		fruit.addFirst("Strawberry");
		System.out.println("After adding strawberry using addFirst() the output is as follow =>" + fruit);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Adding element at the end of the linked list:");
		fruit.addLast("Kiwi");
		System.out.println("After adding kiwi using addLast() the output is as follow =>" + fruit);
		System.out.println("------------------------------------------------------------------------------------------");
	}

}
