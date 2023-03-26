package com.java.collections.interfaces.linkedlist;

import java.util.LinkedList;

public class RemoveElementFromLinkedListExample 
{
	public static void main(String[] args)
	{
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("################################# LINKED LIST DEMO: Removing elements from linked list ##########################################");
		System.out.println("------------------------------------------------------------------------------------------");
		LinkedList<String> fruits= new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Oranges");
		fruits.add("Kiwi");
		fruits.add("Strawberry");
		System.out.println("Inital values added are as follows => "+ fruits);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Removing the first element from LinkedList using removeFirst()");
		String elemente1=fruits.removeFirst();
		System.out.println("After removing the first element from the Linked List is as follows =>"+ fruits);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Removing the last element from LinkedList using removeLast()");
		String elemente2=fruits.removeLast();
		System.out.println("After removing the last element from the Linked List is as follows =>"+ fruits);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Removing specific element from LinkedList using remove()");
		fruits.remove("Mango");
		System.out.println("After removing the last element from the Linked List is as follows =>"+ fruits);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Removing all elements from LinkedList using clear()");
		fruits.clear();
		System.out.println("After removing all element from the Linked List using clear() is as follows =>"+ fruits);		
		
	}

}
