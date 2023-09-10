package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonLaunchAndEnterdata 
{
 public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	WebElement search_text = driver.findElement(By.id("twotabsearchtextbox"));
	search_text.sendKeys("Mobile phones");
	Thread.sleep(2000);
	search_text.clear();
	}
}