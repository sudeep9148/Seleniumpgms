package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshow 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
	Thread.sleep(2000);
	driver.findElement(By.xpath(""))
	
}
}
