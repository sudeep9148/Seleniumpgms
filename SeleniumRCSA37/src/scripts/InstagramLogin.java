package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin
{
 public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Seleniumsoftware/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name = 'username'] ")).sendKeys("sudeepappugowda@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name = 'password'] ")).sendKeys("1234@Sude");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[type = 'submit'] ")).click();
	}
}


