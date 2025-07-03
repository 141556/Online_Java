package SeleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQA_Elements {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Aswini\\Online_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/");
		Thread.sleep(200);
		driver.manage().window().maximize();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();

		// Text Box
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		driver.findElement(By.id("userName")).sendKeys("Aswini");
		driver.findElement(By.id("userEmail")).sendKeys("aswini@gmail.com");
		jse.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.id("currentAddress")).sendKeys("Bangalore");
		jse.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(200);

		// Check Box: Home Check Box
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		jse.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
		List<WebElement> Checkboxlist = driver
				.findElements(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));
		System.out.println(Checkboxlist.size());
		Thread.sleep(200);
		// Choose home check box
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();

		// Radio Button
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		List<WebElement> radios = driver
				.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']"));
		System.out.println("Total Radio Buttons:" + radios.size());
		String ExpResult = "Yes";
		for (int i = 0; i < radios.size(); i++) {
			if (radios.get(i).getText().equalsIgnoreCase(ExpResult)) {
				radios.get(i).click();
				System.out.println(ExpResult + " clicked");
			}
		}
//		WebDriverWait wt = new WebDriverWait(driver, 60);
//		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='yesRadio']"))).click();
//		System.out.println(ExpResult + " clicked");

		// Web Table
		jse.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
		List<WebElement> firtName = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
		System.out.println(firtName.size());
		jse.executeScript("window.scrollBy(0,-100)");

	}

}
