package SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Aswini\\Online_Training\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.get("https://www.facebook.com");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// 1st way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();

		// 2nd Way appropriate Approach
		List<WebElement> radios = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Tptal Radie Buttons:" + radios.size());
		String ExpResult = "Female";
		for (int i = 0; i < radios.size(); i++) {
			if (radios.get(i).getText().equalsIgnoreCase(ExpResult)) {
				radios.get(i).click();
				System.out.println(ExpResult + " clicked");
			}
		}

		Thread.sleep(2000);
		List<WebElement> radios1 = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total Radio buttons:" + radios1.size());
		String ExpResult1 = "Male";
		for (int j = 0; j < radios1.size(); j++) {
			if (radios1.get(j).getText().equalsIgnoreCase(ExpResult1)) {
				radios1.get(j).click();
				System.out.println(ExpResult1 + " clicked");
			}

		}
		
		Thread.sleep(2000);
		List<WebElement> radios2 = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total Radio buttons:" + radios2.size());
		String ExpResult2 = "Custom";
		for (int j = 0; j < radios2.size(); j++) {
			if (radios2.get(j).getText().equalsIgnoreCase(ExpResult2)) {
				radios2.get(j).click();
				System.out.println(ExpResult1 + " clicked");
			}

		}

	}

}
