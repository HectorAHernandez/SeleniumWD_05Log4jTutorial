package alphaPackage;   //instructor's email: rahulonlinetutor@gmail.com

import org.apache.logging.log4j.*;  //this for import the log4j .jar files.
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//import demoAlpha;

public class T06FormMethods {
  private static Logger log = LogManager.getLogger(T06FormMethods.class.getName());
  
  public static void main(String[] args) {
// TODO Auto-generated method stub
   log.debug("Setting chrome driver property");
   WebDriver driver;
   System.setProperty("webdriver.gecko.driver","C:\\selenium-3.11.0\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\selenium-3.11.0\\chromedriver.exe");  
//   driver = new FirefoxDriver();
	driver = new ChromeDriver();   
  // WebDriver driver =new ChromeDriver();
   driver.manage().window().maximize();
   log.info("Window Maximized");
   log.debug("Now hitting Amazon server");
   driver.get("https://www.amazon.com/");
   log.info("Landed on amazon home page");
   Actions a =new Actions(driver);


 a.moveToElement(driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("capitalletters").doubleClick().build().perform();
a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();


   driver.get("http://jqueryui.com/demos/droppable/");
   log.debug("Getting the frames count");
   System.out.println("Number of Frames on page: "+driver.findElements(By.tagName("iframe")).size());
   log.info("Frames count retreived: "+driver.findElements(By.tagName("iframe")).size());
   try
   {
	   driver.switchTo().frame(0);
	   log.info("Successfully switched to frame");
   }
   catch(Exception e)
   {
	   log.error("Cannot identify the frame"); 
   }
 //This is not neeed because already switched in line 47:  driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
   log.debug("Identifying Draggable objects");
   WebElement draggable = driver.findElement(By.id("draggable"));
   WebElement droppable = driver.findElement(By.id("droppable"));
   new Actions(driver).dragAndDrop(draggable, droppable).build().perform();
   log.info("Drag and drop success");       

	}
}