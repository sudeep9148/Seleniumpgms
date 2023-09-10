package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistertoDemoWebShop
{

	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.demowebshop.tricentis.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='gender-male']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sudeep");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("GS");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sudeepappugowda@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sude9148");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Sude9148");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='register-button']")).click();
			
		}


	}

