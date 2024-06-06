package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//th[text()='Levis Shirt']/following-sibling::td[4]")).getText();
		System.out.println(price);
	}

}
