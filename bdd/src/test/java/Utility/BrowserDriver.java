package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDriver {

	
	public static WebDriver driver;
	
	public ChromeOptions options;
	
	public BrowserDriver() {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
		WebDriverManager.firefoxdriver().setup();
		this.driver=new FirefoxDriver();
		this.driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/");
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		this.driver.manage().window().maximize();
	}
	
	public void close()
	{
		this.driver.close();
	}
}
