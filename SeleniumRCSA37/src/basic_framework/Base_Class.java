package basic_framework;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
	public static WebDriver driver;
	@BeforeClass
	public static void OpenApplication()
	{
		System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.demowebshop.com/");
	}
	@AfterClass
	public static void CloseApplication()
	{
		driver.quit();
	}

}
