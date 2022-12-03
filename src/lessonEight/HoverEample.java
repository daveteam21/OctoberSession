package lessonEight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.TestBase;

public class HoverEample extends TestBase{
// Go to browserstack.com hover over product
	
	@Test
	public void testHover () {
		driver.get("https://www.browserstack.com/");
		WebElement productMenu = driver.findElement(By.id("product-menu-toggle"));
		
		
		//Actions class- need to create a new object of the class
		
		// First thing need to do when you create a new obj -> give any name of the class
		Actions seleniumAction = new Actions(driver);
		seleniumAction.moveToElement(productMenu).perform(); 
		}
	
}
