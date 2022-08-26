package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Loginout_cssSelector_Byid {
	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	     driver.manage().window().maximize();
	         
	        driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
	        driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
	         driver.findElement(By.cssSelector("#btnLogin")).click();
              driver.findElement(By.id("welcome")).click();
		       Thread.sleep(1000);
		       driver.findElement(By.linkText("Logout")).click();
			}
	}
