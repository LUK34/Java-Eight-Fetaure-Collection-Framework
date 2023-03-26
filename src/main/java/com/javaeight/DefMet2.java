package com.javaeight;

interface J
{	
	default void m1() 
	{
		System.out.println("Hello m1-I");
	}
}

interface K
{	
	default void m1()
	{
		System.out.println("Hello m1-J");
	}
}

public class DefMet2 implements J,K
{
	public static void main(String[] args)
	{
		DefMet2 d= new DefMet2();
		d.m1();
	}
	
	@Override
	public void m1()
	{
		J.super.m1();
	}


}
