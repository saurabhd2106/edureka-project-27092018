package day5;

public class DemoWorkingWithEdge {

	public static void main(String[] args) {
		WorkingWithEdge we = new WorkingWithEdge();
		
		we.invokeBrowser();
		
		System.out.println(we.getPageTitle());
		
		we.closeBrowser();

	}

}
