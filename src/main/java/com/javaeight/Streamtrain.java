package com.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamtrain
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l1=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		System.out.println(l1);
		
		//Prog to take the list of number greater than 20
		List<Integer>collect1= l1.stream().filter(i->i>20).collect(Collectors.toList());
		System.out.println(collect1);
		
		System.out.println("___________________________________________________");		
		
		//Prog to take out final list where we are adding 5 to each element
		List<Integer>collect2= l1.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(collect2);
		
	}

}