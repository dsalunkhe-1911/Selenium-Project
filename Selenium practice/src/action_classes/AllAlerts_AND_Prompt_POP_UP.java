package action_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlerts_AND_Prompt_POP_UP {
	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//*[@name='alert']")).click();
        Thread.sleep(1000);
         driver.switchTo().alert().accept();     //simple alert
       
         driver.findElement(By.xpath("//*[@name='confirmation']")).click();
         Thread.sleep(1000);
          driver.switchTo().alert().dismiss();     //confirmation alert
          
          driver.findElement(By.xpath("//*[@name='prompt']")).click();
          Thread.sleep(1000);
          driver.switchTo().alert().sendKeys("Dhanashri");   //prompt alert
           driver.switchTo().alert().accept();
}
	
}
