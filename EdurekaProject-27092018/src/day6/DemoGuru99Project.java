package day6;

public class DemoGuru99Project {

	public static void main(String[] args) {
		Guru99Project guru = new Guru99Project();
		
		guru.invokeBrowser();
		
		guru.loginToGuru99("mngr155886", "nYzEdYn");
		
		guru.addCustomer();
		
		String customerId = guru.getCustomerId();
		
		System.out.println("Cutomer Id : "+ customerId);

	}

}
