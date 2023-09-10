package scripts;          // at a time to launch multiple browsers

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverExample 
{
	public static WebDriver driver;
	public static void ChromeLaunch()
	{
	 System.setProperty( "webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.close();
	}
	public static void FirefoxLaunch()
      {
	 System.setProperty("webdriver.gecko.driver" , "./Seleniumsoftware/geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.close();
	}
	public static void main(String[] args)
{
ChromeLaunch();
FirefoxLaunch();
}
}

