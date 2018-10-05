package day8;

public class DemoWorkingWithFirefox {

	public static void main(String[] args) {
		
		WorkingWithFirefox wc= new WorkingWithFirefox();
		
		wc.invokeBrowser();
		
		System.out.println(wc.getPageTitle());
		
		wc.closeBrowser();

	}

}
