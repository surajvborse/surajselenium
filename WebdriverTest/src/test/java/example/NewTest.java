package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

public class NewTest {
	private WebDriver driver;


	@Test
	public void testEasy() {
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Demo Guru99 Page"));


	}
	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "F:/Suraj Borse All Data/Selenium 0/softwares/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		//System.setProperty("webdriver.firefox.driver","F:/Suraj Borse All Data/Selenium 0/softwares/gcdriver/geckodriver.exe");
		//driver = new FirefoxDriver();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
