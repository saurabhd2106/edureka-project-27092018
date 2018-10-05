package day9;

import java.util.HashSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		HashSet<String> hashset = new HashSet<>();
		
		hashset.add("Saurabh");
		hashset.add("Mohit");
		hashset.add("Rohit");
		hashset.add("Prema");
		hashset.add("Saurabh");
		
		System.out.println(hashset);
		
		for(String temp: hashset){
			System.out.println(temp);
		}
		
	}

}
