package SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Aswini\\Online_Training\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// 1st way
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total dropdown values:" +birthMonth.size());
		birthMonth.get(3).click();// Apr
		Thread.sleep(2000);
		birthMonth.get(8).click();// Aug

		// 2nd way
		WebElement bMonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bMonth);
		Thread.sleep(2000);
		month.selectByVisibleText("Apr");
		Thread.sleep(2000);
		month.selectByIndex(3);// Mar
		Thread.sleep(2000);
		month.selectByValue("12");// Dec
		System.out.println(month.getFirstSelectedOption().getText());// Dec current selected value

		// 3rd way
		List<WebElement> dropdown = month.getOptions();
		System.out.println("Total Dropdown values 2nd time:" + dropdown.size());
		for (int i = 0; i < dropdown.size(); i++) {
			if (dropdown.get(i).getText().equalsIgnoreCase("Sep")) {
				dropdown.get(i).click();
			}
		}
		// 4th Way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");

	}

}
