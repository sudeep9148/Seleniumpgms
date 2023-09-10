package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myntra5thElementclick 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./Seleniumsoftware/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.myntra.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@data-reactid='909']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@class='results-base']/li[5]")).click();
	}
}
