package day10;

public class DemoFlipkart {

	public static void main(String[] args) {
		FlipkartProject flipkart = new FlipkartProject();
		
		flipkart.invokeBrowser();
		
	//	flipkart.mouseHover();
		
		flipkart.getUrlFromLink();
		
		flipkart.printCountOfNumberOfLinksOnFlipkart();
		
		flipkart.printUrlFromAllLinksOnFlipkart();

	}

}
