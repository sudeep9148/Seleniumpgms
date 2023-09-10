package scripts;    // to launch Redbus

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchRedbus
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://redbus.com");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String title = driver. getTitle();
	System.out.println(title);
	driver.quit();
}
}
