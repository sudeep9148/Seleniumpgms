package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ThreeTextfields 
{
 public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Sudeep.gs/Desktop/selenium_html/Threetextfields.html");
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Hello");
	Thread.sleep(2000);
	driver.findElement(By.name("user-name")).sendKeys("World");
	Thread.sleep(2000);
	driver.findElement(By.className("text-field")).sendKeys("I am QA");
	Thread.sleep(2000);
	driver.quit();
	}
}
