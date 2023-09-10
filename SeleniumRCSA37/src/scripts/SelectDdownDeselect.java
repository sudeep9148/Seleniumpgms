package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDdownDeselect
 
{
public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sudeep.gs/Desktop/selenium_html/HeroinesMultiSelect.html");
		Thread.sleep(1500);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='Heroines']"));
		Select sel=new Select(dropdown);
			sel.selectByIndex(7);
			Thread.sleep(1000);
			sel.selectByValue("C");
			Thread.sleep(1000);
			sel.selectByVisibleText("Ramy");
			Thread.sleep(1000);
			sel.deselectAll();
		}
}