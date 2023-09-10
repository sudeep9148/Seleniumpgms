package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocationofElement_Amazon
 
{
public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.gecko.driver","./Seleniumsoftware/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement aust=driver.findElement(By.xpath("//a[text()='Australia']"));
		Point loc = aust.getLocation();
		System.out.println(loc);
		int y = loc.getY();
		System.out.println(y);
		int x = loc.getX();
		System.out.println(x);
		}
}
