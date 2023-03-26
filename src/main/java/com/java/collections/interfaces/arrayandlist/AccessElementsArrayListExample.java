package com.java.collections.interfaces.arrayandlist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsArrayListExample 
{
	public static void main(String[] args)
	{
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("################################# ARRAY LIST DEMO ##########################################");
		System.out.println("------------------------------------------------------------------------------------------");
		List<String> topProgrammingLanguages= new ArrayList<>();
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("To check if the ArrayList is empty using empty()");
		System.out.println("Is the topProgrammingLanguagee list empty?? : "+ topProgrammingLanguages.isEmpty());
		
		topProgrammingLanguages.add("C");
		topProgrammingLanguages.add("Java");
		topProgrammingLanguages.add("C++");
		topProgrammingLanguages.add("Python");
		topProgrammingLanguages.add(".net");
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("To find the size of the array list");
		System.out.println("Here are the top "+ topProgrammingLanguages.size() +" programming languages in the world");
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("To retrieve an element from a given index");
		String bestProgrammingLanguage= topProgrammingLanguages.get(1);
		System.out.println("Best programming Language => "+ bestProgrammingLanguage);
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("To modify the element at a given index");
		topProgrammingLanguages.set(4, "C#");
		System.out.println(topProgrammingLanguages);
	}
	

}
