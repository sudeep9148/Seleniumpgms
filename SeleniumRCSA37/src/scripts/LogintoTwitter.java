package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoTwitter 
{

	public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twitter.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Phone, email, or username']")).sendKeys("sudeepappugowda@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9148sude");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
	}
		
