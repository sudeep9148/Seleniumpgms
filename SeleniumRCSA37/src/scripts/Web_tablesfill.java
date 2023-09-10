package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public static void main (String [] args) throws InterruptedException
{
System. setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver () ;
driver.get ("https: //www.google.com/maps/@12.9989812, 77.5504667, 15z");
Thread. sleep (4000);
driver. findElement (By. xpath ("//button[@id='hArJGc']/..")).click();
Thread.sleep (4000);
driver. findElement (By. xpath ("//input [@placeholder='Choose starting point, or click on the map... '1/../ .
Thread. sleep (1500);
driver.findElement (By. xpath (" / /button [@data-tooltip='Search' ]/../../../div [1]/div [2]/button [1]")) .click () ;
Thread. sleep (1500);
driver.findElement (By. xpath (" / / input [@placeholder='Choose destination, or click on the map...']/../../../../../../di
Thread. sleep (1500);
driver. findElement (By. xpath (" / /button [@jsaction= 'search; focus: pane. focusTooltip;blur:pane.blurTooltip'] /../../div [2

