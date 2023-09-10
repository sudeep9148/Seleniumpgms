package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeVideo 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com");
	Thread.sleep(2000);
	driver.findElement(By.name("search_query")).sendKeys("Pushpavathi");
	Thread.sleep(2000);
	driver.findElement(By.id("search-icon-legacy")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Media House Studio")).click();
}
}
