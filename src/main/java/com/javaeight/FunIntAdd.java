package com.javaeight;


@FunctionalInterface
interface Inter1
{
	public void sum(int a, int b);
}

public class FunIntAdd 
{
	public static void main(String[] args) 
	{
		Inter1 i = (a,b) -> System.out.println(a+b); 
		i.sum(10, 10);
	}

}
