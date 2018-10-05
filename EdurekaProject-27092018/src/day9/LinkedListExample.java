package day9;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
			LinkedList<Integer> linkedList = new LinkedList<>();
			
			linkedList.add(100);
			linkedList.add(0,700);
			linkedList.add(500);
			
			linkedList.add(900);
			
			System.out.println(linkedList.get(2));
			
			System.out.println(linkedList.contains(1000));
			System.out.println("----------------------------------");
			for(Integer temp : linkedList){
				System.out.println(temp);
			}
	}

}
