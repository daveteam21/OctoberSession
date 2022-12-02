package lessonEight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeOptionsExample {
	@Test
	public void optionsExample(){
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("start-maximized");     // mac version "--start-fullscreen"
		chromeOptions.addArguments("--window-size= 1366,768");    // why doesnt work
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.browserstack.com/");
		
		
		/*        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        */
	}

}
