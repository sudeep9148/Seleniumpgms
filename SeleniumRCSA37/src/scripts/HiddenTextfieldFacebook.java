package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenTextfieldFacebook
 
{
public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.gecko.driver","./Seleniumsoftware/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1500);
		JavascriptExecutor js=(JavascriptExecutor) driver;
				WebElement txt=driver.findElement(By.name("custom_gender"));
				js.executeScript("arguments[0].value='MALE'",txt);
				Thread.sleep(1500);
				driver.findElement(By.xpath("//label[.='Custom']")).click();
				Thread.sleep(1500);
		}
}