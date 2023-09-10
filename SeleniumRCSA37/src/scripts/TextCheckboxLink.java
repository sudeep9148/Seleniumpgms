package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextCheckboxLink
{
 public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Sudeep.gs/Desktop/selenium_html/MultipleElement.html");
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Sudeep");
	Thread.sleep(1500);
	driver.findElement(By.id("cbox")).click();
	Thread.sleep(1500);
	driver.findElement(By.tagName("a")).click();
	}
}
	