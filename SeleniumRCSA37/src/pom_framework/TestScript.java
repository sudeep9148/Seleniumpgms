package pom_framework;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript
{
	@Test
	public void script() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		PomClass pmc=new PomClass(driver);
		pmc.username("first data");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		pmc.username("second data");
	}

}
