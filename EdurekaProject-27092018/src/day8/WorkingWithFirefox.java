package day8;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithFirefox {
	
	FirefoxDriver driver;
	
	public void invokeBrowser(){
		
		System.setProperty("webdriver.gecko.driver", 
				"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://qatechhub.com");
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	public void closeBrowser(){
	//	driver.close();
		
		driver.quit();
	}

}
