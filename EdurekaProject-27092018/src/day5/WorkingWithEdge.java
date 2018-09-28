package day5;

import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithEdge {

	EdgeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.edge.driver", "C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");

		driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://qatechhub.com");
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void closeBrowser() {
		// driver.close();

		driver.quit();
	}

}
