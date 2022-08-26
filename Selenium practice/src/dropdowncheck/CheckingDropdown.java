package dropdowncheck;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingDropdown {
	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	     driver.get("https://mbasic.facebook.com");
	     driver.manage().window().maximize();
	     driver.findElement(By.cssSelector("#signup-button input")).click();
	         Thread.sleep(1000);
	         
	     //select day
	     List<WebElement>dayList=driver.findElements(By.xpath("//*[@id='day']//option"));
            for(WebElement day:dayList) {
            	if(day.getText().equals("19"))
            		day.click();
            }
            
            //select month
   	     List<WebElement>monthList=driver.findElements(By.xpath("//*[@id='month']//option"));
               for(WebElement month:monthList) {
               	if(month.getText().equals("Nov"))
               		month.click();
               }
               
               //select year
      	     List<WebElement>yearList=driver.findElements(By.xpath("//*[@id='year']//option"));
                  for(WebElement year:yearList) {
                  	if(year.getText().equals("1996"))
                  		year.click();
                  }     
     }
}
