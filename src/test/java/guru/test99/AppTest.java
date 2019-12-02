package guru.test99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AppTest {
	
	protected WebDriver driver;
	@Test
  public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		        "/home/ec2-user/cdriver/chromedriver");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		opt.addArguments("window-size=1920x1080");
		//opt.addArguments("--no-sandbox");
		driver = new ChromeDriver(opt);
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.name("search")).sendKeys("Sachin Tendulkar");
		driver.findElement(By.className("sprite svg-search-icon")).click();
               
          String title= driver.getTitle();
          System.out.println(title);
        
          if(title.equalsIgnoreCase("Sachin Tendulkar - Wikipedia")){
          System.out.println("Success");
          }
          else{
          System.out.println("Failure");
          }       
        driver.close();
		
	}
}

