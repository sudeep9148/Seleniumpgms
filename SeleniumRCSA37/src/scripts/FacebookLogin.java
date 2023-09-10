package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin 
{
 public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("Hello@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("pass")).sendKeys("World@123");
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
	}
}