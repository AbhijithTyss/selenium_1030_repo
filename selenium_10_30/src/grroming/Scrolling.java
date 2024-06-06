package grroming;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapp.skillrary.com/");
		Actions act=new Actions(driver);
		WebElement courseEle = driver.findElement(By.xpath("//h3[text()='Latest Courses']"));
		
		act.scrollToElement(courseEle).perform();
		
//		act.scrollByAmount(0, 3000).perform();
//		act.scrollByAmount(0, 1000).perform();
//		act.scrollByAmount(0, 1000).perform();
	}

}
