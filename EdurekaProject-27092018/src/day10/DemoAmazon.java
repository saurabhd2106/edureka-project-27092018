package day10;

public class DemoAmazon {
	
	public static void main(String[] args) {
		AmazonProject am = new AmazonProject();
		
		am.invokeBrowser();
		
		am.searchProduct("Apple Watch", "Watches");
		
		am.getNthProduct(10);
		
		am.getAllProductsViaScrollDownUsingJS();
	}

}
