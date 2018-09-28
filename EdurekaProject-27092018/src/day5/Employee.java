package day5;

public class Employee {

	int salary, bonus;
	
	public Employee() {
		salary = 50000;
		bonus = 5000;
	}
	
	public Employee(int salary, int bonus) {
		this.salary = salary;
		this.bonus = bonus;
		
	}

	public void calculateSalary() {
		int totalSalary;

		totalSalary = salary + bonus;

		System.out.println("Total salary : " + totalSalary);
	}

	int calculateSalary1() {
		int totalSalary;

		totalSalary = salary + bonus;
		
		return totalSalary;
	}
	
	int calculateSalary2(int sal, int bon) {
		int totalSalary;

		totalSalary = sal + bon;
		
		return totalSalary;
	}
	
	int calculateSalary3(int salary, int bonus) {
		int totalSalary;

		totalSalary = this.salary + bonus;
		
		return totalSalary;
	}

}
