package com.javaeight;

interface I{
	
	default void m1() {
		System.out.println("Hello m1-I");
	}

}
public class DefMet1 implements I
{
	public static void main(String[] args)
	{
		DefMet1 d= new DefMet1();
		d.m1();
	}
	
	public void m1()
	{
		System.out.println("Hello m1-D");
	}

}
