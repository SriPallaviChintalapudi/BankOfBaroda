package program;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;


public class PracticeForm {
	public WebDriver driver;
  @Test
  
  public void f() throws Exception {
	  
	  //FirstName
	  driver.findElement(By.id("firstName")).sendKeys("Sri Pallavi");
	  
	  //lastName
	  driver.findElement(By.id("lastName")).sendKeys("Chintalapudi");
	  Thread.sleep(2000);
	  
	  //Email
	  driver.findElement(By.id("userEmail")).sendKeys("pchintalapudi28@gmail.com");
	  
	  Thread.sleep(2000);
	  
	  //gender
	  driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
	  Thread.sleep(2000);
	  
	  //mobile
	  driver.findElement(By.id("userNumber")).sendKeys("9999999999");
	  
	  Thread.sleep(2000);
	  
	  //Date of Birth
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  Thread.sleep(2000);
	  
	  //Month
	  new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"))).selectByVisibleText("December");
	  Thread.sleep(2000);
	  
	  //year
	  new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("2002");
	  Thread.sleep(2000);
	  
	  //day
	  driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]")).click();
	  
	  Thread.sleep(2000);
	  
	  //Subjects
	  driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
	  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
	  
	  //hobbies
	  driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
	  
	  //picture
	  driver.findElement(By.id("uploadPicture")).sendKeys("file:///C:/Users/HP/OneDrive/Desktop/training/download.webp");
	  Thread.sleep(3000);
	  
	  //currentAddress
	  driver.findElement(By.id("currentAddress")).sendKeys("yanam");
	  
	  //state
	  driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]")).click();
	  
	  //city
	  driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]")).click();
  }
  
  @BeforeTest
  
  public void OpenURL() {
	  
	 driver = new ChromeDriver();
	 driver.get("https://demoqa.com/automation-practice-form");
	 driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
