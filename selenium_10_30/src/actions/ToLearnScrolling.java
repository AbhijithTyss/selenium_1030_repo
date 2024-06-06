package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement sitemapLink = driver.findElement(By.linkText("Sitemap"));
		Actions act=new Actions(driver);
		act.scrollToElement(sitemapLink).perform();
		act.scrollByAmount(0, 300).perform();
		Thread.sleep(2000);
		act.scrollByAmount(0, -300).perform();
	}

}
