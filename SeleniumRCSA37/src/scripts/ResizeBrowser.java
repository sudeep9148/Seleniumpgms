package scripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResizeBrowser
 
{
public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.gecko.driver","./Seleniumsoftware/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		}
}

