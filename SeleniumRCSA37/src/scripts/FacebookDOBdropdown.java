package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDOBdropdown 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//a[@role='button' and @rel='async']")).click();
	Thread.sleep(1500);
	 WebElement dropdown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	 Select sel=new Select(dropdown);
		sel.selectByIndex(10);
		Thread.sleep(1000);
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 Select sel1=new Select(dropdown1);
		 sel1.selectByIndex(6);
			Thread.sleep(1000);
			WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			 Select sel2=new Select(dropdown2);
				sel2.selectByVisibleText("2001");
	}
}
