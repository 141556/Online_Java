package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNg8 {

	WebDriver driver;
	@BeforeClass
	public void setEnv() {
		System.setProperty("webdriver.chrome.driver", "C:\\Aswini\\Online_Training\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	@DataProvider
	public Object[][] dataSet() throws Exception{
	File src3 = new File(
			"C:\\Users\\Vijay\\git\\repository\\Online_Java\\OnlineTraining\\Config\\TestData.properties");
	FileInputStream fis3 = new FileInputStream(src3);
	Properties pro3 = new Properties();
	pro3.load(fis3);
	
	Object arr[][] = new Object[3][2];
	arr[0][0]=pro3.getProperty("TestData1");
	arr[0][1]=pro3.getProperty("TestData2");
	
	arr[1][0] = "TestData2";
	arr[1][1] = "TestData2";
	
	arr[2][0] = "TestData3";
	arr[2][1] = "TestData3";
	
	return arr;
	}
	@Test(dataProvider = "dataSet")
	public void enterData(String username, String password) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
}
