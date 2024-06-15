package program;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alerts {
	
	public WebDriver driver;
	
	// for alert button
	
 /* @Test (priority = 0)
  
  public void f() throws Exception{
	  driver.findElement(By.id("alertButton")).click();
	  String str = driver.switchTo().alert().getText();
	  System.out.println(str);
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  
  }*/
  
  // for timeralert button
  
  @Test (priority = 1)
  
  public void f1() throws Exception {
	  driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	  String str1 = driver.switchTo().alert().getText();
	  Thread.sleep(5000);
	  System.out.println(str1);
	  driver.switchTo().alert().accept();
  } 
  
  // for confirmation alert ok
  
 /* @Test (priority = 2)
  
  public void f2() throws Exception {
	  driver.findElement(By.id("confirmButton")).click();
	  String str = driver.switchTo().alert().getText();
	  Thread.sleep(2000);
	  System.out.println(str);
	  
	  // if we want to click ok change dismiss to accept
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(2000);
	  System.out.println(driver.findElement(By.id("confirmResult")).getText());
  }
  
  
  //for promtButton
  
  @Test
  
  public void f3() throws Exception {
	  driver.findElement(By.id("promtButton")).click();
	  String str = driver.switchTo().alert().getText();
	  System.out.println(str);
	  driver.switchTo().alert().sendKeys("Pallavi");
	  Thread.sleep(2000);
	  
	  //if we want to click cancel change accept to dismiss
	  driver.switchTo().alert().accept();
	  System.out.println(driver.findElement(By.id("promptResult")).getText());
  }
  */
  @BeforeTest
  
  public void beforeTest() throws Exception {
	  
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
}
