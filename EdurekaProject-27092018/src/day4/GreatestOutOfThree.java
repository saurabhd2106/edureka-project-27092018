package day4;

public class GreatestOutOfThree {

	public static void main(String[] args) {

		int num1 = 45, num2 = 78, num3 = 78;

		if (num1 > num2 && num1 > num3) {
			System.out.println("Number 1 is greater");
		} else if (num2 > num3 && num2 > num1) {
			System.out.println("Number 2 is greater");
		} else if (num3 > num2 && num3 > num1) {
			System.out.println("Number 3 is greater");
		} else {
			System.out.println("All three are equal..");
		}

	}

}
