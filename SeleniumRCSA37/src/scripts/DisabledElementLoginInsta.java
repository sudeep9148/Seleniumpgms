package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisabledElementLoginInsta
 
{
public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.gecko.driver","./Seleniumsoftware/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement un=driver.findElement(By.name("username"));
		//js.executeScript("arguments[0].value='12345432'",un);
		un.sendKeys("12345432");
		Thread.sleep(1500);
		WebElement pwd=driver.findElement(By.name("password"));
		//js.executeScript("arguments[0].value='9876542'",pwd);
		pwd.sendKeys("9876543");
		Thread.sleep(1500);
		WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(1500);
		js.executeScript("arguments[0].click();",btn);
		}
}
