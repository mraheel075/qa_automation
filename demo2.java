package muhammadraheel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

 
public class demo2 {
 
 public WebDriver driver;
 
  
  @Test (enabled=true, dependsOnMethods = { "testcase3" })
  public void testcase1() {
  
	  driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	  
	  
	  driver.findElement(By.name("firstname")).sendKeys("Muhammad");
	  driver.findElement(By.name("lastname")).sendKeys("Raheel");
	  driver.findElement(By.id("sex-0")).click();
	  driver.findElement(By.id("exp-1")).click();
	  driver.findElement(By.id("datepicker")).sendKeys("15-06-2020");
	  driver.findElement(By.id("profession-0")).click();
	  driver.findElement(By.id("profession-1")).click();
	  driver.findElement(By.id("tool-2")).click();
	  
	  driver.findElement(By.id("continents")).click();
	    new Select(driver.findElement(By.id("continents"))).selectByVisibleText("Australia");
	  driver.findElement(By.id("continents")).click();
	  driver.findElement(By.xpath("//select[@id='selenium_commands']/option[5]")).click();
	  
	  String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\testdata\\testfile.jpg"; 
	  driver.findElement(By.id("photo")).sendKeys(filePath);
	  
	  driver.findElement(By.id("submit")).click();
 

  }
	  
  @Test (enabled=true, dependsOnMethods = { "testcase3" } )
  public void testcase2() {
  
  driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
  
 
  driver.findElement(By.name("firstname")).sendKeys("Muhammad");
  driver.findElement(By.name("lastname")).sendKeys("Raheel");
  driver.findElement(By.id("sex-0")).click();
  driver.findElement(By.id("exp-1")).click();
  driver.findElement(By.id("datepicker")).sendKeys("15-06-2020");
  driver.findElement(By.id("profession-0")).click();
  driver.findElement(By.id("profession-1")).click();
  driver.findElement(By.id("tool-2")).click();
  
  String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\testdata\\testfile.jpg"; 
  driver.findElement(By.id("photo")).sendKeys(filePath);
  
  
  driver.findElement(By.id("submit")).click();
 
  }
  
  
  @Test (enabled=true)
  public void testcase3() {
  
  driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
  driver.getTitle();
  String ActualTitle = driver.getTitle();
  String ExpectedTitle = "Selenium Practice Form";
  Assert.assertEquals(ActualTitle, ExpectedTitle);
 
  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
   
   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
   
   
  }
 
  @AfterClass
  public void afterClass() {
   driver.close();
  }
 
}