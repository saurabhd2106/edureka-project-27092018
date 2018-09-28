package day5;

public class DemoEmployee {

	public static void main(String[] args) {

		// Declaring a variable
		Employee saurabh;

		// Instantiating and Initializing a variable
		saurabh = new Employee();

		saurabh.salary = 100000;

		saurabh.bonus = 5000;

		saurabh.calculateSalary();

		// ----------------------------------------------
		Employee prema = new Employee();

		prema.salary = 895034;
		prema.bonus = 54534;

		prema.calculateSalary();

		System.out.println("-----------------------------------------");

		Employee ajith = new Employee();

		ajith.salary = 90000;
		ajith.bonus = 8999;

		int salary = ajith.calculateSalary1();

		System.out.println("Salary of Ajith : " + salary);
		
		System.out.println("-----------------------------------------");
		
		Employee dipthi = new Employee();
		
		int deeptiSalary = dipthi.calculateSalary2(90000, 2432);
		
		System.out.println("Salary of dipti : "+ deeptiSalary);
		
		System.out.println("-----------------------------------------");
		
		Employee shuchi = new Employee();
		
		shuchi.salary = 100000;
		
		shuchi.bonus = 90000;
		
		int shuchiSalary = shuchi.calculateSalary3(500000, 60000);
		
		System.out.println("Salary of Shuchi : "+ shuchiSalary);
		
		System.out.println("-------------------------------");
		
		Employee abitha = new Employee(70000,40000);
		
		abitha.calculateSalary();
		
	}

}
