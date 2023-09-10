package scripts;    // to launch youtube

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchInstagram
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://instagram.com");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String title = driver. getTitle();
	System.out.println(title);
	driver.quit();
}
}
