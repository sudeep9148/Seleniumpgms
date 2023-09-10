package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxForloop
 
{
public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.gecko.driver","./Seleniumsoftware/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Sudeep.gs/Desktop/selenium_html/10Checkboxs.html");
		Thread.sleep(2000);
		List<WebElement> cbox = driver.findElements(By.xpath("//input"));
			for(WebElement box:cbox)
			{
				box.click();
			}
			for(int i=cbox.size()-1;i>=0;i--)
			{
				cbox.get(i).click();
			}
		}
}