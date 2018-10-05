package day9;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class TreesetExample {
	
	public static void main(String[] args) {
		
		TreeSet<String> treeset = new TreeSet<>(Collections.reverseOrder());
		
		treeset.add("Saurabh");
		treeset.add("Rohit");
		treeset.add("Abha");
		treeset.add("Mohit");
		treeset.add("zinky");
		treeset.add("Prema");
		treeset.add("Saurabh");
		
		System.out.println(treeset);
		
		for(String temp: treeset){
			System.out.println(temp);
		}
		
	}

}
