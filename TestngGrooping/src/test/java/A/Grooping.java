package A;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grooping {
	@BeforeMethod
	private void beforemethid() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sures\\eclipse-workspace\\Cucumber_Dummy\\src\\test\\resources\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bestbuy.ca/en-ca");

	}
    
	@Test(groups = { "smoke" })
	private void test() {
		System.out.println("1");

	}

	@Test(groups = { "sanity" })
	private void test2() {
		System.out.println("2");

	}

	@Test(groups = { "smoke", "sanity" })
	private void test3() {
		System.out.println("3");

	}

	@Test(groups = { "sanity" })
	private void test4() {
		System.out.println("4");

	}

	@Test(groups = { "smoke", "sanity" })
	private void test5() {
		System.out.println("5");

	}

	@Test(groups = { "sanity" })
	private void test6() {
		System.out.println("6");

	}

}
