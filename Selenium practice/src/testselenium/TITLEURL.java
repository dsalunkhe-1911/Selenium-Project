package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TITLEURL {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
		     WebDriver driver = new ChromeDriver();
				 
				
		     driver.navigate().to("https://opensource-demo.orangehrmlive.com/");//use to launch URL
		     driver.manage().window().maximize();
		         
		         String title=driver.getTitle();
		         String url=driver.getCurrentUrl(); 
		        System.out.println(title);
		        System.out.println(url);
			
	 WebElement userName = driver.findElement(By.xpath("//input[@name'txtUserName']"));
     userName.sendKeys("Admin");
     
     WebElement password = driver.findElement(By.name("txtPassword"));
     password.sendKeys("admin123");
     
     WebElement btnLogin = driver.findElement(By.id("textbtnLogin"));
     btnLogin.click();
     Thread.sleep(2000);
     driver.close();
  }
}




