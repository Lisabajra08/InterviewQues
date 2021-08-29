package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	WebDriver driver;
	
	
	public void init() {
		//Setting system property
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("​https://moneygaming.qa.gameaccount.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
