package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopNewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		String parentId = driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id: allWindowIds) {
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(url.contains("facebook")) {
				break;
			}
		}
		driver.findElement(By.xpath("//input[@id=':ru:']")).sendKeys("testing");
		driver.close();
		driver.switchTo().window(parentId);
		driver.close();
	}

}
