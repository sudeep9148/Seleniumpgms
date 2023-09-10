package scripts;       // to launch empty browser
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeBrowserLaunch 
{
	public static void main(String[] args) 
	{
		String key = "webdriver.chrome.driver";
		String value ="./Seleniumsoftware/chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver driver = new ChromeDriver();
	}
}
