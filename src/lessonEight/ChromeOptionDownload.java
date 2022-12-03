package lessonEight;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.TestBase;

public class ChromeOptionDownload extends TestBase{
	@Test
	public void DownloadFile() {
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=107.0.5304.62/"); 
		driver.findElement(By.linkText("chromedriver_win32.zip")).click();
		
	}
	

}
