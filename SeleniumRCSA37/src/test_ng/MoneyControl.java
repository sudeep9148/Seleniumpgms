package test_ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class MoneyControl 
{
	@org.testng.annotations.Test (priority = 1)
	public void Mostactive()
	{
		System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement price = driver.findElement(By.xpath("//div[@id=\"in_maNSE\"]/table/tbody/tr[1]/td[2]/b"));
		js.executeScript("arguments[0].scrollIntoView();",price);
		String p = price.getText();
		Reporter.log(p,true);
	}

	@org.testng.annotations.Test (priority = 2)
	public void Topgainer()
	{
		System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement price1 = driver.findElement(By.xpath("//div[@id=\"in_tgNifty\"]/table/tbody/tr[1]/td[2]/b"));
		js.executeScript("arguments[0].scrollIntoView();",price1);
		String p1 = price1.getText();
		Reporter.log(p1,true);
	}
	@org.testng.annotations.Test (priority = 3) 
	public void Toplosers()
	{
		System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement price2 = driver.findElement(By.xpath("//div[@id=\"in_tlNifty\"]/table/tbody/tr[1]/td[2]/b"));
		js.executeScript("arguments[0].scrollIntoView();",price2);
		String p2 = price2.getText();
		Reporter.log(p2,true);
	}
	
}
