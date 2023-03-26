package com.java.collections.interfaces.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListLambda 
{
	public static void main(String[] args) 
	{
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(10,"Ramesh",30, 40000));
		emp.add(new Employee(20,"Bramesh",29, 35000));
		emp.add(new Employee(30,"Sadjesh",25, 30000));
		emp.add(new Employee(40,"Sujesh",21, 50000));
		
		System.out.println("Sorting salary in ascending order in a collection ArrayList. We are using comparator logic in Lambda expression.");
		Collections.sort(emp, (o1,o2) ->(int)(o1.getSalary() - o2.getSalary()) );
		System.out.println(emp);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Sorting salary in ascending order in a collection ArrayList. We are using comparator logic in Lambda expression.");
		Collections.sort(emp, (o1,o2) ->(int)(o2.getSalary() - o1.getSalary()) );
		System.out.println(emp);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Sorting name in ascending order in a collection ArrayList. We are using compareTo for string in Lambda expression.");
		Collections.sort(emp, (o1,o2) ->(int)(o1.getName().compareTo(o2.getName())));
		System.out.println(emp);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Sorting name in descending order in a collection ArrayList. We are using compareTo for string in Lambda expression.");
		Collections.sort(emp, (o1,o2) ->(int)(o2.getName().compareTo(o1.getName())));
		System.out.println(emp);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		
		
	}

}
