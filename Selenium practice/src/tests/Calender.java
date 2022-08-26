package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {
	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
	     driver.manage().window().maximize();
            Thread.sleep(2000);
	        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.id("btnLogin")).click();
	       
	        driver.findElement(By.id("menu_time_viewTimeModule")).click();
	        driver.findElement(By.id("menu_attendance_Attendance")).click();
	        driver.findElement(By.id("menu_attendance_punchIn")).click();
    driver.findElements(By.xpath("//input[contains(@id,='attendance_date']//following-sibling::img)"));
  
	     WebElement months=driver.findElement(By.cssSelector(".ui-datepicker-month"));
          Select month=new Select(months);
          month.selectByIndex(10);
          
          WebElement years= driver.findElement(By.cssSelector(".ui-datepicker-year"));
          Select year=new Select(years);
          year.selectByValue("1996");
     
       Thread.sleep(2000);          
      driver.findElement(By.xpath("//a[text()='19']")).click();
}
  
}
