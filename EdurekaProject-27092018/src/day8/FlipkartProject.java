package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartProject {

	ChromeDriver driver;

	void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		Dimension dim = new Dimension(600, 600);
		driver.manage().window().setSize(dim);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

	}

	public void mouseHover() {
		WebElement electronicsLink = driver.findElement(By.xpath("//span[text()='Electronics']"));

		Actions action = new Actions(driver);

		action.moveToElement(electronicsLink).build().perform();

		waitTillElementVisible(By.linkText("Samsung"), 10);

		WebElement samsungLink = driver.findElement(By.linkText("Samsung"));

		action.moveToElement(samsungLink).click().build().perform();
	}

	private void waitTillElementVisible(By by, int timeInSeconds) {

		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);

		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
