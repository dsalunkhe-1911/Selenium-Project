package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ATCalender {
	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	     driver.manage().window().maximize();
       driver.findElement(By.xpath("//*input[@id=datepicker2']")).click();
       
       WebElement months=driver.findElement(By.xpath("//select[@class='datepicker-month-year']following-sibling::select//preceding-sibling::select"));
	      Select month=new Select(months);
	      month.selectByValue("11/2022");
	
	driver.findElement(By.xpath("//select[@class='datepicker-month-year']following-sibling::select//option(contains[text(),'*']")).click();
	
	WebElement years=driver.findElement(By.xpath("//select[@class='datepicker-month-year']following-sibling::select"));
	Select year=new Select(years);
    year.selectByValue("11/1996");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='19']")).click();
	}
}
