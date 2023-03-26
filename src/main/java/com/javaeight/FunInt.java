package com.javaeight;

@FunctionalInterface
interface MyInterface{
	public void m1();
}

public class FunInt
{
	public static void main(String[] args)
	{
		MyInterface i = () -> System.out.println("Hello World");
		i.m1();
	}
}
/*
 1. Invoking lambda expression using functional interface

*/