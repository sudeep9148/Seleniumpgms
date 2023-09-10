package basic_framework;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestScript extends Base_Class
{
	@Test
	public void script() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("Smartphone");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
	}

}
