package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonProject {

	ChromeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://www.amazon.in");
	}

	public void selectPrimeMusic() {

		Actions action = new Actions(driver);

		WebElement searchCat = driver.findElement(By.id("nav-link-shopall"));

		action.moveToElement(searchCat).build().perform();

		WebElement alexaLink = driver.findElement(
				By.xpath("(//span[text()='Echo & Alexa'])[1]"));

		action.moveToElement(alexaLink).click().build().perform();

	}
}
