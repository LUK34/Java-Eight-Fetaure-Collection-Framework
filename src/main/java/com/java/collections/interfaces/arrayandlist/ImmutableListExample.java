package com.java.collections.interfaces.arrayandlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListExample
{
	public static void main(String[] args)
	{
	List<String> fruits= new ArrayList<String>();
	fruits.add("Banana");
	fruits.add("Mango");
	fruits.add("Orange");
	System.out.println("Java 8 method to make a list as Immutable..meaning we cannot change the list if we use unmodifiableList() method");
	fruits = Collections.unmodifiableList(fruits);
	fruits.add("Strawberry");
	}

}
