package SeleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Aswini\\Online_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
//		Thread.sleep(30000); - Always it will wait for 30 seconds -not recommended
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff workS");
		
//		Handle Auto suggestions
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total Elements found: "+ allSuggestions.size());
		
		for(int i =0;i<allSuggestions.size();i++) {
			String ExpResult = "How stuff works sceince";
			if(allSuggestions.get(i).getText().equalsIgnoreCase(ExpResult));
			allSuggestions.get(i).click();
			System.out.println(ExpResult);
			break;
		}

	}

}
