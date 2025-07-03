package SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Aswini\\Online_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");

		// Accept Alert using javascriptExecutor
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('confirmButton').clcik()");
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");

		//Dismiss Alert using javascriptExecutor
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('confirmButton').clcik()");
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed");

	}

}
