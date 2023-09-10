package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoShaadi
{

	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.shaadi.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sudeepappugowda@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("deepu");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@data-testid='sign_in']")).click();
			
		}


	}

