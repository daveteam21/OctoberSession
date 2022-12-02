package lessonEight;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.TestBase;

public class ParameterizedTest extends TestBase {

	@Test
	public void testAlert () {
	
		driver.get("https://profile.w3schools.com/log-in");
		WebElement SignUpLink = driver.findElement(By.xpath("//*/form/div[1]/div[1]/span/span"));
		SignUpLink.click();
		
		WebElement EmailInput = driver.findElement(By.id("modalusername"));
		WebElement PasswordInput = driver.findElement(By.id("new-password"));
		WebElement SignUpButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[5]/div[1]/button/span"));
		EmailInput.sendKeys("talent tech@gmail.com");
		SignUpButton.click();
		
		WebElement ErrorMsgEmail = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[2]/form/div[1]/span"));
								
		// Assert.assertEquals(ErrorMsgEmail.getText(), "sss" ); Test failed first
		Assert.assertEquals(ErrorMsgEmail.getText(), "Looks like you forgot something" );
		
	}
	}
