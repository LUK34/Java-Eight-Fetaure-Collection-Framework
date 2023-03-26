package com.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods 
{
	public static void main(String[] args)
	{
		List<String> ley= new ArrayList<>();
		ley.add("Aman");
		ley.add("Adithya");
		ley.add("Durgesh");
		ley.add("Sham");
		ley.add("Bran");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Filter Method in streams part 1:");
		List<String> ley1=ley.stream().filter(i->i.startsWith("A")).collect(Collectors.toList());
		System.out.println(ley1);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Filter Method in streams part 2:");
		System.out.println(ley.stream().filter(i->i.startsWith("A")).collect(Collectors.toList()));
		System.out.println("-----------------------------------------------------------------------------");
		List<Integer> ley2= new ArrayList<>();
		ley2.add(26);
		ley2.add(426);
		ley2.add(264);
		ley2.add(65);
		ley2.add(67);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Map Method in streams part 1:");
		List<Integer> ley3=ley2.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(ley3);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Map Method in streams part 2:");
		System.out.println(ley2.stream().map(i->i*i).collect(Collectors.toList()));
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("forEach Method using streams part 1:");
		ley.stream().forEach(j->{System.out.println(j);});
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("forEach Method using streams part 2:");
		ley.stream().forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------------");
		
		
		
	}
}