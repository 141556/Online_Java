package SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Aswini\\Online_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		
		//Delete all cookies
		driver.manage().deleteAllCookies();
		
		
		//Java Script Executor
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 
		 jse.executeScript("document.getElementById('email').value='abc@gmail.com'");	 
		 jse.executeScript("document.getElementsByName('pass')[0].value='1234'");
		 jse.executeScript("document.getElementsByName('login')[0].click()");
		 
		 
		 //Scroll up 
		 jse.executeScript("window.scrollBy(0,-500)");
		 
		 //Scroll down
		 jse.executeScript("window.scrollBy(0,500)");
		 
		
		
		
	}

}
