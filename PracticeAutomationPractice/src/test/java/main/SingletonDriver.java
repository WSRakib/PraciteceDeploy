package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonDriver {

	private WebDriver driver;
	
	public SingletonDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void open() {
		
	}

	public WebDriver OpenBrowser(String browser, String url) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/");
			driver.navigate().to(url);
				
		}
		
		else if(browser.equalsIgnoreCase("Edge")) {
			
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.navigate().to("https://www.goole.com");
			driver.navigate().to(url);
			
		}
		
		else if(browser.equalsIgnoreCase("FireFox")) {
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.navigate().to("https://www.google.com");
			driver.navigate().to(url);
			
		}
		return driver;
	}
	
	
}
