package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartAmazonPrice
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Seleniumsoftware/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.amazon.in");
		Thread.sleep(1500);
		d.findElement(By.name("field-keywords")).sendKeys("Samsung A34 phone black");
		Thread.sleep(1500);
		d.findElement(By.xpath("//input[@value=\"Go\"]")).click();
		Thread.sleep(1500);
		WebElement welcome_text=d.findElement(By.xpath("//span[text()='30,999']"));
		String text = welcome_text.getText();
		System.out.println(text);
		Thread.sleep(2000);
		d.get("https://www.flipkart.com");
		Thread.sleep(1500);
		d.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Samsung A34 phone black");
		Thread.sleep(3500);
		d.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1500);
		d.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(1500);
	    WebElement Welome_text1 = d.findElement(By.xpath("(//div[@class=\"_3tbKJL\"]/div//div[text()='₹32,999'])[1]"));
	    String str = Welome_text1.getText();
	    System.out.println(str);
	}
}
//(//span[.=' Galaxy '])[2]/../../../../div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[)