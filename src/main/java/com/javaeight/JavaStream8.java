package com.javaeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import oracle.sql.converter.I18CharacterConvertersWrapper;

public class JavaStream8 
{
	
	public static void main(String[] args)
	{
		JavaStream8 s= new JavaStream8();
		List<Employee> el=new ArrayList<>();
		el.add(new Employee(100,"Sanji",27000));
		el.add(new Employee(101,"Nami Swaaan",25000));
		el.add(new Employee(102,"Nico Robin",26000));
		
		
		
		/*----------------------------- SIMPLE way PART 1 without  Java streams----------------------------------------*/
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Simple way PART 1 without java streams:");
		for(int i=0;i<el.size();i++)
		{
			if(el.get(i).getEname().startsWith("N"))
			{
				System.out.println(el.get(i).getEname());
			}
		}
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Simple way PART 2s without java streams:");
		for(int i=0;i<el.size();i++)
		{
			if(s.check(el.get(i)))
			{
				System.out.println("Emp name is " + el.get(i).getEname());
			}
		}
		
		
		//Calling stream and then using lambda expression
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Example with Stream  API code:");
		el.stream().filter((d)->d.getEname().startsWith("N")).forEach((x)->System.out.println(x.getEname()));
		
		/*
			1.Filter is a method that is taking predicate. 
			Predicate is a functional interface which is having one abstract method called Test.
		  	This Test takes one argument and return boolean value. 
		 
		 	2.So here predicate is a functional interface.
		  	So we can use lambda expression.
		  	
		  	3. Here d is an employee object. In d we will call the getEname method and stratsWith method
		  	
		  	4. Here filter is called an Intermediate operation.
		 */
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Write a stream programme to get the name of all employees into a separate list:");
		List<String>list_name=el.stream().map((f)->f.getEname()).collect(Collectors.toList());
		System.out.println(list_name);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Write a stream programme to get minimum salary of employees:");
		Employee el2=el.stream().min((i1,i2)->i1.getEsal()-i2.getEsal()).get();
		System.out.println("The employee with minimum salary is "+el2.getEname()+" with salary of "+el2.getEsal());
		
		//here min method has comparator. Comparator takes 2 arguments
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Write a stream programme to get maximum salary of employees:");
		Employee el3=el.stream().max((i1,i2)->i1.getEsal()-i2.getEsal()).get();
		System.out.println("The employee with maximum salary is "+el3.getEname()+" with salary of "+el3.getEsal());
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Write a stream programme to remove duplicate values:");		
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(25);
		l1.add(10);
		l1.add(30);
		l1.add(20);
		List<Integer> l2=l1.stream().distinct().collect(Collectors.toList());
		System.out.println("The unique list is as follows: "+l2);
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Write a stream programme to sort the array lists in ASC Order and DESC Order:");		
		List<Integer> l3=new ArrayList<>();
		l3.add(101);
		l3.add(204);
		l3.add(256);
		l3.add(108);
		l3.add(330);
		l3.add(720);
		System.out.println("Sorted List using streams in ASC ORDER is as follows:");
		l3.stream().sorted().forEach((x)->{System.out.println(x);});
		System.out.println("Sorted List using streams in DESC ORDER is as follows:");
		l3.stream().sorted(Collections.reverseOrder()).forEach((x)->{System.out.println(x);});
		/*
		 1. Here distinct is an intermediate operation. That will not give output until terminal operation is executed.
		 
		 */
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Write a stream programme to get the list of employees salary in ASC Order and DESC Order:");	
		//List<String>list_name=el.stream().map((f)->f.getEname()).collect(Collectors.toList());
		System.out.println("Employees salary in ASC Order" + el.stream().map( (x)->x.getEsal() ).sorted().collect(Collectors.toList()));
		System.out.println("Employees salary in DESC Order" + el.stream().map( (x)->x.getEsal() ).sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		System.out.println("-------------------------------------------------------------------------------------------");		
		System.out.println("Nested List to store Multiple Lists");
		List<String> newList1= new ArrayList<>();
		newList1.add("Karthik 1");
		newList1.add("Karthik 2");
		newList1.add("Karthik 3");
		List<String> newList2= new ArrayList<>();
		newList2.add("Ashok 1");
		newList2.add("Ashok 2");
		newList2.add("Ashok 3");
		List<List<String>> finalList= new ArrayList();	//VERY IMPORTANT
		finalList.add(newList1);
		finalList.add(newList2);
		System.out.println(finalList);
		System.out.println("-------------------------------------------------------------------------------------------");
		/*
		 Map is used for one to one conversion. Flat Map is used for One to many  
		 */
		System.out.println(" Map is used for one to one conversion. Flat Map is used for One to many");
		System.out.println("To club the lists into a single list we do the following:");
		finalList.stream().flatMap( (c)->c.stream() ).collect( Collectors.toList());
		System.out.println("Output of Flat Map is as follows:"+ finalList.stream().flatMap( (c)->c.stream() ).collect( Collectors.toList()));
		System.out.println("-------------------------------------------------------------------------------------------");
		
		/*
		  Flat Map is a intermediate operation.
		 */
		
		/*------------------------------------------------------------------------------------------------------*/
			//Consumer is a part of stream API. This is a predefined Interface
			Consumer<Integer> c=(x)->System.out.println(x);
			c.accept(10);
			//the above example here we did not create any user interface. we user a predefined interface.
	}
	
	boolean check(Employee e)
	{
		if(e.getEname().startsWith("N"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

/*
 1.Streams are used to perform operations on top of collections.
 2. Collection is collection of objects.
 3. Advantage of collection over array is collection can grown dynamically while array does not grow.
 4. Stream is an Interface. Streams are immutable.
 5. U have to use filter method for some condition.Filter has predicate..it will take argument and return boolean.  
 */