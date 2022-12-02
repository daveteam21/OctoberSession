package lessonEight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.TestBase;

public class ParameterizedTestDataProvidorPW extends TestBase {


	@Test (dataProvider = "invalidEmailAddress")  // need to add dataProvider here so it know where to test
		public void testAlert (String email) {
		
		//	@Test (dataProvider = "invalidpassword")  // need to add dataProvider here so it know where to test
		//	public void testAlert (String password) {
			
			driver.get("https://profile.w3schools.com/log-in");
			WebElement SignUpLink = driver.findElement(By.xpath("//*/form/div[1]/div[1]/span/span"));
			SignUpLink.click();
			
		WebElement EmailInput = driver.findElement(By.id("modalusername"));
			WebElement PasswordInput = driver.findElement(By.id("new-password"));
			WebElement SignUpButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[5]/div[1]/button/span"));
		EmailInput.sendKeys(email);
	//		PasswordInput.sendKeys(password);
			SignUpButton.click();
			
			WebElement ErrorMsgEmail = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[2]/form/div[1]/span"));
			Assert.assertEquals(ErrorMsgEmail.getText(), "Looks like you forgot something" );
			
		}
	
		*@DataProvider(name = "invalidEmailAddress")
		public Object[][] invalidEmailAddress() {
			String[][] invalidEmails = {"talent tech@gmail.com","As23$567"} ,{"talenttech@gmail", "As23$567"}, {"talent&*%@gmail.com", "As23$567"}, {"abc20@gmail.com", "As23$567"};
			return invalidEmails;
		} 
		
	/*	@DataProvider(name = "invalidEmailAddress")
		public Object[] invalidEmailAddress() {
			String[] invalidEmails = {"talent tech@gmail.com", "talenttech@gmail", "talent&*%@gmail.com" , "abc20@gmail.com"};
			return invalidEmails;
		} */
			
		/* @DataProvider(name = "invalidpassword")
			public Object[] invalidpassword() {
				String[] invalidpassword = {"As23$567", "As23$567", "As23$567" , "As23$567m"};
				return invalidpassword; */
		
		}
}
