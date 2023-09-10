package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoDemoWebShop
{

	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.demowebshop.tricentis.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),' in')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sudeepappugowda@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sude9148");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("smartphone");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Add your review']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='AddProductReview.Title']")).sendKeys("Excellent");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@id='AddProductReview_ReviewText']")).sendKeys("Good product");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Submit review']")).click();
			
		}


	}

