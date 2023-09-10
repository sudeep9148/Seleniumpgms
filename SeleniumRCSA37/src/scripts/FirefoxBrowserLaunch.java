package scripts;              // to launch empty browser
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxBrowserLaunch 
{
	public static void main(String[] args)
	{
		String key = "webdriver.gecko.driver";
		String value ="./Seleniumsoftware/geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver = new FirefoxDriver();
	}
}

/* public static void main(String[] args) throws InterruptedException 
{
	String key = "webdriver.gecko.driver";
	String value ="./Seleniumsoftware/geckodriver.exe";
	System.setProperty(key,value);
	FirefoxDriver driver = new FirefoxDriver();
	Thread.sleep(2000);
	driver.close();
}*/
