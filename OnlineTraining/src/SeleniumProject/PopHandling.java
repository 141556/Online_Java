package SeleniumProject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Aswini\\Online_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,500)");

		// Tab Handling
		Thread.sleep(2000);
		driver.findElement(By.id("tabButton")).click();
		// Get the total number of open tabs
		Set<String> allWindowsId = driver.getWindowHandles();
		String parentWindow = driver.getWindowHandle();
		System.out.println("All Windows Id: " + allWindowsId);
		System.out.println("Parent Windows Id: " + parentWindow);

		for (String abcd : allWindowsId) {
			driver.switchTo().window(abcd);
			if (abcd.equals(parentWindow)) {
				System.out.println("Parent Tab Title: " + driver.getTitle());
			} else {
				System.out.println("Child Tab Url:" + driver.getCurrentUrl());
			}
		}

		// Window Handling
		driver.switchTo().window(parentWindow);
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('windowButton').click()");
		// Get the total number of open tabs
		Set<String> allWindowsId2 = driver.getWindowHandles();
		System.out.println("All windows Id: " + allWindowsId2);
		for (String window : allWindowsId2) {
			driver.switchTo().window(window);
			System.out.println("Window Id: " + window);
			System.out.println("Title: " + driver.getTitle());
			System.out.println("URL: " + driver.getCurrentUrl());

		}
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Windows and Tabs Handled");

	}

}
