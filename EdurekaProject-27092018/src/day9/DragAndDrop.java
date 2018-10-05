package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameElement);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		String colorBeforeDnD = target.getCssValue("color");
		
		System.out.println("Before Drag and Drop :: "+ colorBeforeDnD);
		
		Actions action = new Actions(driver);
		
	//	action.dragAndDrop(source, target).build().perform();
		
		action.moveToElement(source).clickAndHold(source).moveToElement(target).release().build().perform();
		
		String colorAfterDnD = target.getCssValue("color");
		
		System.out.println("After Drag and Drop :: "+ colorAfterDnD);
	}

}
