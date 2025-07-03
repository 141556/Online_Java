package SeleniumProject;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws Exception {
		// Specify the location of config property file
		File src1 = new File(
				"C:\\Users\\Vijay\\git\\repository\\Online_Java\\OnlineTraining\\Config\\Config.properties");
		FileInputStream fis1 = new FileInputStream(src1);
		Properties pro1 = new Properties();
		pro1.load(fis1);

		// Specify the location of Locators property file
		File src2 = new File(
				"C:\\Users\\Vijay\\git\\repository\\Online_Java\\OnlineTraining\\Config\\Locators.properties");
		FileInputStream fis2 = new FileInputStream(src2);
		Properties pro2 = new Properties();
		pro2.load(fis2);

		// Specify the location of TestData property file
		File src3 = new File(
				"C:\\Users\\Vijay\\git\\repository\\Online_Java\\OnlineTraining\\Config\\TestData.properties");
		FileInputStream fis3 = new FileInputStream(src3);
		Properties pro3 = new Properties();
		pro3.load(fis3);

		// Setting the property of chrome driver and passing chrome driver path
		System.setProperty(pro1.getProperty("driverProperty"), pro1.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro1.getProperty("URL_1"));

		// getProperty() method will accept key and value of that key
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
		driver.findElement(By.xpath(pro2.getProperty("password"))).sendKeys(pro3.getProperty("TestData2"));

	}

}
