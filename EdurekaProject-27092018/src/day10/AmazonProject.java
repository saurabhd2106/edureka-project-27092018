package day10;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonProject {

	ChromeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://www.amazon.in");
	}

	public void searchProduct(String product, String category) {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select selCategory = new Select(dropdown);

		selCategory.selectByVisibleText(category);

		driver.findElement(By.xpath("//input[@value='Go' and @class='nav-input']")).click();

		String result = driver.findElement(By.id("s-result-count")).getText();

		System.out.println("Result : " + result);
	}

	public void getNthProduct(int productNumber) {
		String atfResultsVar = "atfResults";
		String productXpath = String.format("//div[@id='%s']/ul[@id='s-results-list-atf']/li[%d]", atfResultsVar,
				productNumber);

		System.out.println(productXpath);
		String productDetails = driver.findElement(By.xpath(productXpath)).getText();

		System.out.println(productDetails);
	}

	public void getAllProductsViaScrollDown() {

		List<WebElement> allProducts = driver
				.findElements(By.xpath("//div[@id='atfResults']/ul[@id='s-results-list-atf']/li"));

		Actions action = new Actions(driver);
		
		for (WebElement product : allProducts) {
			
			action.moveToElement(product).build().perform();
			System.out.println(product.getText());

			System.out.println("------------------------------------------");
		}

	}
	
	public void getAllProductsViaScrollDownUsingJS() {

		List<WebElement> allProducts = driver
				.findElements(By.xpath("//div[@id='atfResults']/ul[@id='s-results-list-atf']/li"));

		
		int X, Y;
		for (WebElement product : allProducts) {
			
			X = product.getLocation().x;
			
			Y = product.getLocation().y;
			
			scrollBy(X, Y);
			
			System.out.println(product.getText());

			System.out.println("------------------------------------------");
		}

	}

	
	private void scrollBy(int x, int y){
		
		JavascriptExecutor jsEngine;
		
		jsEngine = (JavascriptExecutor) driver;
		
		String jsCommand = String.format("window.scrollBy(%d,%d)", x, y);
		
		jsEngine.executeScript(jsCommand);
	}
	
	public void getAllProducts() {

		List<WebElement> allProducts = driver
				.findElements(By.xpath("//div[@id='atfResults']/ul[@id='s-results-list-atf']/li"));

		WebElement NthProduct = allProducts.get(10);

		String result = NthProduct.getText();

		System.out.println(result);
		
		System.out.println("-------------------------");

		for (WebElement product : allProducts) {
			System.out.println(product.getText());

			System.out.println("------------------------------------------");
		}

	}
}
