package com.java.collections.interfaces.arrayandlist;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayListDemo 
{
	public static void main(String[] args)
	{
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("##################################### LIST DEMO ##########################################");
		System.out.println("------------------------------------------------------------------------------------------");
		List<String> l= new ArrayList<>();
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("List will allow u to add duplicate elements");
		l.add("element 1");
		l.add("element 1");
		l.add("element 2");
		System.out.println(l);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("List will allow u to add null values");
		l.add(null);
		l.add(null);
		System.out.println(l);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("List will allow u to maintain insertion order");
		List<String> l1= new ArrayList<>();
		l1.add("element1");//0
		l1.add("element2");//1
		l1.add("element3");//2
		l1.add("element4");//3
		l1.add("element5");//4
		System.out.println(l1);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("List will allow u to access its elements using list index values");
		System.out.println(l1.get(0));
		System.out.println(l1.get(3));
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("################################# ARRAY LIST DEMO ##########################################");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("ArrayList doesnt support primitive data types so we use Repo types");
		List<Integer> firstFivePnos= new ArrayList<>();
		firstFivePnos.add(2);
		firstFivePnos.add(3);
		firstFivePnos.add(5);
		firstFivePnos.add(7);
		firstFivePnos.add(11);
		System.out.println(firstFivePnos);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Passing ArrayList to ArrayList Constructor ");
		List<Integer> firstTenPnos= new ArrayList<>(firstFivePnos);
		System.out.println(firstTenPnos);
		System.out.println("------------------------------------------------------------------------------------------");
		List<Integer> nextFivePnos= new ArrayList<>();
		nextFivePnos.add(13);
		nextFivePnos.add(17);
		nextFivePnos.add(19);
		nextFivePnos.add(23);
		nextFivePnos.add(29);
		System.out.println("Adding First 10 prime numbers to next 5 prime number using addAll() method");
		firstTenPnos.addAll(nextFivePnos);
		System.out.println(firstTenPnos);
		System.out.println("------------------------------------------------------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
