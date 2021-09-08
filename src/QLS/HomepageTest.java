package QLS;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HomepageTest {

@Test
 public void SearchItem() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\automation\\QLS Academy\\Driver\\chromedriver.exe");
	  
	 WebDriver driver = new ChromeDriver();
	 String url = "https://www.amazon.in";
	  
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).click();
	  driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iPhone 12");
	  driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
	  System.out.println("Git Update");
	  
	  
	  String actual = driver.findElement(By.xpath("//span[text()='New Apple iPhone 12 (128GB) - (Product) RED']")).getText();
	  String exp = "New Apple iPhone 12 (128GB) - (Product) RED";
	  
	  assertEquals(actual, exp);
	  
	  driver.quit();
  }
}