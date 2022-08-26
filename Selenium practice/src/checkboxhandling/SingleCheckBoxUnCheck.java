package checkboxhandling;

import java.awt.Desktop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleCheckBoxUnCheck {
	
	public static void main(String args[])throws InterruptedException{
System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demoqa.com/checkbox");
	     driver.manage().window().maximize();
     WebElement Home=driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']"));
     System.out.println("Home checkbox class Attribute value:"+Home.getAttribute("class"));
     
WebElement Home1=driver.findElement(By.xpath("//*[text()='Home']//parent::span//preceding-sibling::span[@class'rct-checkbox']"));
     System.out.println("Home checbox is Displayed:"+Home1.isDisplayed()+"\n");
	  Home1.click();
	  Home1.click();
      driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']")).click();
WebElement Desktop=driver.findElement(By.xpath("//*[text()='Desktop']//parent::span//preceding-sibling::span[@class'rct-checkbox']"));	
     System.out.println("Desktop checkbox is Enabled:"+Desktop.isEnabled());	
     System.out.println("Desktop checbox is Displayed:"+Desktop.isDisplayed()+"\n");
     Desktop.click();
WebElement Document=driver.findElement(By.xpath("//*[text()='Documents']//parent::span//preceding-sibling::span[@class'rct-checkbox']"));	
     System.out.println("Documents checkbox is Enabled:"+Document.isEnabled());	
     System.out.println("Documents checbox is Displayed:"+Document.isDisplayed()+"\n");
     Document.click();	
WebElement Download=driver.findElement(By.xpath("//*[text()='Downloads']//parent::span//preceding-sibling::span[@class'rct-checkbox']"));	
     System.out.println("Downloads checkbox is Enabled:"+Download.isEnabled());	
     System.out.println("Downloads checbox is Displayed:"+Download.isDisplayed()+"\n");
     Download.click();
    }
	
}
