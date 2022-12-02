package lessonEight;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeOptionDownload2 {
	
	
	@Test
	public void DownloadFile() {
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--window-size= 1366,768");    
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put ("download.default_directory", "C:\\Users\\davet\\eclipse-workspace\\OctoberSession\\lib");
		
		chromeOptions.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=107.0.5304.62/"); 
		driver.findElement(By.linkText("chromedriver_win32.zip")).click();
	}
	

}
