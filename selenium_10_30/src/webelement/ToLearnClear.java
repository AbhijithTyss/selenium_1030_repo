package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTF = driver.findElement(By.id("username"));
		usernameTF.clear();
		usernameTF.sendKeys("abhijith");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	}

}
