package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextofAllOptionDropdown
 
{
public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sudeep.gs/Desktop/selenium_html/HeroinesMultiSelect.html");
		Thread.sleep(1500);
		 WebElement dropdown = driver.findElement(By.xpath("//select[@id='Heroines']"));
		Select sel=new Select(dropdown);
		 List<WebElement> options = sel.getOptions();
		for(WebElement option:options)
			{
				String text= option.getText();
				System.out.println(text);
			}
		}
}