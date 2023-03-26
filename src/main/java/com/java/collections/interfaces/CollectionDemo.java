package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo 
{
	public static void main(String[] args)
	{
		Collection<String> fc = new ArrayList<>();
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Collection add() method");
		fc.add("banana");
		fc.add("apple");
		fc.add("mango");
		System.out.println("OUTPUT:");
		System.out.println(fc);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Collection remove() method");
		fc.remove("banana");
		System.out.println(fc);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Collection contains() method");
		System.out.println("Returns true if there is element in collection. else it will return false");
		System.out.println(fc.contains("apple"));
		System.out.println(fc.contains("banana"));
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Collection foreach() method. We will use Lambda expression to print each element in collection");
		System.out.println("the output will be displayed line by line");
		fc.forEach( (element) -> { System.out.println(element); } );
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Collection clear() method");
		System.out.println("Clear the elements from the collection");
		fc.clear();
		System.out.println(fc);
		
	}
}
