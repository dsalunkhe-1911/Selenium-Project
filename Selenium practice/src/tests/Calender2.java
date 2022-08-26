package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender2 {
	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	     driver.manage().window().maximize();
       driver.findElement(By.xpath("//*input[@id=datepicker1']")).click();
       
    int i=0;
    while(i>=0) {
    	driver.findElement(By.xpath("span//@[text()='prev']")).click();	
	    driver.findElement(By.xpath("//@[text()='19']")).click();
	    String text=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	    if(text.equals("Nov 1996"))
	    break;
	    i++;
	 }
	driver.findElement(By.xpath("//a[text()='19']")).click();
   }
}
