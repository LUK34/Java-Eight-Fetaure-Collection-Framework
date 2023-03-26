package com.java.collections.interfaces.hashset;

import java.util.HashSet;
import java.util.Collections;
import java.util.Set;

public class ImmutableSetExample 
{
	public static void main(String[] args) {
		Set<String> s= new HashSet<String>();
		s.add("Apple");
		s.add("Mango");
		s.add("Cherry");
		System.out.println("Java 8 method to make a Set as Immutable..meaning we cannot change the Set if we use unmodifiableSet() method");
		s = Collections.unmodifiableSet(s);
		s.add("Strawberry");
	}

}
