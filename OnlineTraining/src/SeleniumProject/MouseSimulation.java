package SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Aswini\\Online_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/elec-b2b-store?fm=neo%2Fmerchandising&iid=M_d345966d-e3ff-4d40-ac88-d3373ca6eee3_1_372UD5BXDFYS_MC.1B9DW42USMK1&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Electronics~Electronics%2BGST%2BStore_1B9DW42USMK1&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L1_view-all&cid=1B9DW42USMK1");

		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(electro).build().perform();
		Thread.sleep(3000);
		act.moveToElement(men).build().perform();
		act.contextClick(electro);
		act.sendKeys(Keys.ENTER);
	

	}

}
