package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClickonCheckboxusingname
{
 public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Sudeep.gs/Desktop/selenium_html/TextCbox.html");
	Thread.sleep(2000);
	driver.findElement(By.name("check")).click();

	}
}
