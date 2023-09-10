package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonCheckboxusingTag 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Sudeep.gs/Desktop/selenium_html/checkbox.html");
	Thread.sleep(1500);
	driver.findElement(By.tagName("input")).click();
	}
}
