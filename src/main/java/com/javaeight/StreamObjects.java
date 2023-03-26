package com.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjects
{
	public static void main(String[] args)
	{
		System.out.println("We create blank streams as follows:");
		Stream<Object> emptyStream=Stream.empty();
		System.out.println(emptyStream);
		System.out.println("----------------------------------------------------------------");
		System.out.println("Array, Object, Collection:");
		String names[]= {"Durgesh","Ram","Sham","Bran"};
		Stream<String> s1 = Stream.of(names);
		s1.forEach(i->System.out.println(i));
		System.out.println("----------------------------------------------------------------");
		System.out.println("Can create streams using buid method of Builder");
		Stream<Object> sBuild= Stream.builder().build();
		System.out.println("----------------------------------------------------------------");
		System.out.println("Can specify the stream in array of int type also");
		IntStream stream= Arrays.stream(new int[] {2,3,4,65,267});
		stream.forEach(i->System.out.println(i));
		System.out.println("----------------------------------------------------------------");
		List<Integer> l1= new ArrayList<>();
		l1.add(2);
		l1.add(4);
		l1.add(3);
		l1.add(27);
		l1.add(20);
		l1.add(37);
		l1.add(45);
		l1.stream().forEach(i->System.out.println(i));
		System.out.println("----------------------------------------------------------------");
		
		
	}
}
