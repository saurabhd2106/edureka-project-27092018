package day9;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
			ArrayList<Integer> arrayList = new ArrayList<>();
			
			arrayList.add(100);
			arrayList.add(0,700);
			arrayList.add(500);
			
			arrayList.add(900);
			
			System.out.println(arrayList.get(2));
			
			System.out.println(arrayList.contains(1000));
			System.out.println("----------------------------------");
			for(Integer temp : arrayList){
				System.out.println(temp);
			}
	}

}
