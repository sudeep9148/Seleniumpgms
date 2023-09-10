package scripts;    // to launch Twitter

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchTwitter
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://twitter.com");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String title = driver. getTitle();
	System.out.println(title);
	driver.quit();
}
}
