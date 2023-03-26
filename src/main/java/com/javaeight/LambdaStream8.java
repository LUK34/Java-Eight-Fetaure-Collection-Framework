package com.javaeight;

public class LambdaStream8 
{
	public static void main(String[] args) 
	{
		LambdaStream8 l= new LambdaStream8();
		TestInterface t= () -> System.out.println("Display method is called using lambda expression");
		t.display();
		AddInterface a= (i,j)->{
			System.out.println("Addition using Lambda");
			return i+j;
		};
		System.out.println(a.add(10, 5));
		
		//Lambda enables functional programming
		l.division((x,y)->{
				System.out.println("x is "+x+"y is "+y);
				return x+y;
		});
		
	}
	
		
		
	public void division(AddInterface i)
	{
		System.out.println("Inside division method");
	}
}


/*
1. If we have more than 1 method in the Interface. And we are trying to access that method using lambda expression
we will not be able to because of ambiguity. This is because the Lambda expression has no name to access the method
within the interface.

2. Lambda can written for an interface that takes only 1 abstract method.

3. So we use @FunctionalInterface. This annotation will restrict the developer to add more than one method in the interface.
Thus preventing ambiguity in lambda expression.

4.Functional Programming is passing the function as method argument.

 */