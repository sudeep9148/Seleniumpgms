package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisabledElementDataPass
 
{
public static void main(String[] args) throws InterruptedException
		{
		//System.setProperty("webdriver.gecko.driver","./Seleniumsoftware/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sudeep.gs/Desktop/selenium_html/DisabledElementDatapass.html");
		Thread.sleep(1500);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('text-field').value='abcd'");
		Thread.sleep(1500);
		js.executeScript("document.getElementById('text-field').value=' '");  // to clear the text field
		}
}