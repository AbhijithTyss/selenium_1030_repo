package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);//C848
	}

}
