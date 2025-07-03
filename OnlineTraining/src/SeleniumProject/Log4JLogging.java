package SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Log4JLogging {

	public static void main(String[] args) {
		// create Logger instance
		Logger logger = Logger.getLogger("Log4JLogging");
		
		//Configure log4j.properties file
		PropertyConfigurator.configure("C:\\Users\\Vijay\\git\\repository\\Online_Java\\OnlineTraining\\log4j.properties");
		
		//Open Browser instance
		System.setProperty("webdriver.chrome.driver", "C:\\Aswini\\Online_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Opened Browser Instance");
		
		//Maximize the window
		driver.manage().window().maximize();
		logger.debug(driver);
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implicit wait added");
		
		//Launch Application
		driver.get("https://www.facebook.com/");
		logger.info("Application launched");
		
		try {
			driver.findElement(By.id("emails"));
		} catch (Exception e) {
			logger.info(e);
		}
		System.out.println("Element not found");

	}

}
