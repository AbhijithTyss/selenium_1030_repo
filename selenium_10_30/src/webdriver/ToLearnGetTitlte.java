package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitlte {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Insta")) {
			System.out.println("user navigated successfully");
		}else {
			System.out.println("User failed to navigate");
		}
	}

}
