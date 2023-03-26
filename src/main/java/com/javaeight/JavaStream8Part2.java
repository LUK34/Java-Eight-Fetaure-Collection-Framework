package com.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream8Part2 
{
	public static void main(String[] args)
	{
		List<Integer> l1= new ArrayList<>();
		l1.add(2);
		l1.add(4);
		l1.add(3);
		l1.add(27);
		l1.add(20);
		l1.add(37);
		l1.add(45);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Add elements into List using add() method");
		System.out.println(l1);
		
		List<Integer> l2= Arrays.asList(60,75,65,34);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Adding elements using Arrays.asList() method");
		System.out.println(l2);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("List to print even numbers with streams:");
		List<Integer> listEven= new ArrayList<>();
		for(Integer i:l1)
		{
			if(i%2==0)
			{
				listEven.add(i);
			}		
		}
		System.out.println(listEven);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("List to print even numbers with streams:");
		Stream<Integer> s= l1.stream();
		List<Integer>cols = s.filter(i->i%2 == 0).collect(Collectors.toList());
		System.out.println(cols);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Reducing the above line of code to print List of even numbers with streams:");
		List<Integer>cols2=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(cols2);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Reducing the above line of code even further:");
		System.out.println(l1.stream().filter(i->i%2==0).collect(Collectors.toList()));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("To filter out numbers that is greater than 10");
		List<Integer>col4=l1.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println(col4);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Reducing the above line of code even further:");
		System.out.println(l1.stream().filter(i->i>10).collect(Collectors.toList()));
		System.out.println("---------------------------------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
