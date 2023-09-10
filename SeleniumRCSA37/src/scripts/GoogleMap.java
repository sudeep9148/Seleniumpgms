package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/@12.9695744,77.6077312,12z");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//img[@src='//maps.gstatic.com/tactile/omnibox/directions-2x-20150909.png']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("majestic");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("rajirajnagar");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@data-tooltip='Search']")).click();
		Thread.sleep(1500);
	}
}

