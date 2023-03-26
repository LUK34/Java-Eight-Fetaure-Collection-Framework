package com.java.collections.interfaces.arrayandlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CopyListToAnotherListExamples
{
	public static void main(String[] args)
	{
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("################ COPY LIST TO ANOTHER LIST EXAMPLE ########################################");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Using Constructors: ");
		List<String> fc = new ArrayList<String>();
		fc.add("banana");
		fc.add("apple");
		fc.add("mango");
		fc.add("oranges");
		List<String> copyfc = new ArrayList<String>(fc);
		System.out.println(copyfc);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Using addAll() method: ");
		List<String> copy = new ArrayList<>();
		copy.addAll(fc);
		System.out.println(copy);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Using Collection.copy() method: ");
		List<String> cp= new ArrayList<>(fc.size());
		cp.add("a");
		cp.add("b");
		cp.add("c");
		cp.add("d");
		Collections.copy(cp,fc);
		System.out.println(cp);		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Using Java 8 method: ");
		List<String> cp1= fc.stream().collect(Collectors.toList());
		System.out.println(cp1);
	}

	
}
