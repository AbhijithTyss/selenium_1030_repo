package list;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapp.skillrary.com/");
		WebElement price = driver.findElement(By.id("cars"));
		Select priceSelect = new Select(price);
		priceSelect.selectByIndex(0);
		priceSelect.selectByValue("99");
		priceSelect.selectByVisibleText("INR 200 - INR 299 ( 3 )");

//		priceSelect.deselectAll();
		priceSelect.deselectByIndex(1);
		System.out.println(priceSelect.isMultiple());

		List<WebElement> allOptoions = priceSelect.getOptions();
		System.out.println(allOptoions.size());
		for (WebElement ele : allOptoions) {
			System.out.println(ele.getText());
		}
	}

}
