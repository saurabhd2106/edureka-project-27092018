package day9;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
		
		linkedSet.add("Saurabh");
		linkedSet.add("Mohit");
		linkedSet.add("Rohit");
		linkedSet.add("Prema");
		linkedSet.add("Saurabh");
		
		System.out.println(linkedSet);
		
		for(String temp: linkedSet){
			System.out.println(temp);
		}
		
	}

}
