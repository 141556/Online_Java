package SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) throws Exception {
		// Setting the property of chrome driver and passing chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Aswini\\Online_Training\\chromedriver.exe");

		// Launching the chrome browser instance
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		Thread.sleep(3000);
		driver.manage().window().maximize();

		// Open the url using get() method
		Thread.sleep(3000);
		driver.get("https://www.facebook.com");

		// Open the url using navigate() method
		Thread.sleep(3000);
		driver.navigate().to("https:www.google.com");

		// Refresh the page
		Thread.sleep(3000);
		driver.navigate().refresh();

		// Navigate back
		Thread.sleep(3000);
		driver.navigate().back();

		// Navigate forward
		Thread.sleep(3000);
		driver.navigate().forward();

		// Print the current url
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());

		// fetch the title of the web page
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		//Close the browser
		Thread.sleep(3000);
		driver.close();

	}

}
