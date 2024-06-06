package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNg {
	@Test
	public void test() {
		Reporter.log("DemoTestNg class added",true);
	}
}
