package checkboxhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simpletest {
	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		//method related with browser level
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.id("btnLogin")).click();
	        driver.findElement(By.xpath("//b[text()='PIM']")).click();
	        driver.findElement(By.xpath("//a[text()='Ananya']//parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
		}

}
