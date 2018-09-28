package day5;

public class DemoWorkingWithChrome {

	public static void main(String[] args) {
		
		WorkingWithChrome wc= new WorkingWithChrome();
		
		wc.invokeBrowser();
		
		System.out.println(wc.getPageTitle());
		
		wc.closeBrowser();

	}

}
