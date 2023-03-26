package com.java.collections.interfaces.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetOverviewAndDemo 
{
	public static void main(String[] args)
	{
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("################################# HASH SET DEMO ##########################################");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("HashSet will display only one element. If there are duplicates");
		Set<String> set= new HashSet<>();
		set.add("element1");
		set.add("element1");
		System.out.println(set.toString());
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("HashSet has unordered collection of elements. It will display in ordered manner");
		Set<String> set1= new HashSet<>();
		set1.add("element1");
		set1.add("element4");
		set1.add("element7");
		set1.add("element6");
		set1.add("element3");
		set1.add("element2");
		System.out.println(set1.toString());
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("HashSet can contain only one null value");
		Set<String> set2= new HashSet<>();
		set2.add(null);
		set2.add(null);
		System.out.println(set2.toString());
		System.out.println("------------------------------------------------------------------------------------------");		
		
	}
}
