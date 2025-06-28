package SeleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Aswini\\Online_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		List allFrames = driver.findElements(By.tagName("iframe"));
		
		for (int i = 0;i<allFrames.size();i++) {
			driver.switchTo().frame(i);
			WebElement droppable = driver.findElement(By.id("droppable"));
			WebElement draggable = driver.findElement(By.id("draggable"));
			
			if(draggable.isDisplayed()) {
				Actions act = new Actions(driver);
				act.dragAndDrop(draggable, droppable).build().perform();
			}
		}

	}

}
