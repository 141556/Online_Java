package SeleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Aswini\\Online_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("kurti");

//      Suggestions handle
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc']/li"));
		System.out.println("All Suggestion:" + allSuggestions.size());

		String ExpResult = "Kurti set for women";
		for (int i = 0; i < allSuggestions.size(); i++) {
			if (allSuggestions.get(i).getText().equalsIgnoreCase(ExpResult)) {
				;
				allSuggestions.get(i).click();

//			Thread.sleep(3000);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println(ExpResult);

			}
		}

	}

}
