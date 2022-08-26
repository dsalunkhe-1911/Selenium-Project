package checkboxhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandling {
	
	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
	     driver.manage().window().maximize();
            Thread.sleep(2000);
	        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.id("btnLogin")).click();
	       
	        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	        driver.findElement(By.id("menu_admin_UserManagement")).click();
List <WebElement> chkBoxes=driver.findElements(By.xpath("//input[contains(@id,='ohrmList_chkSelectRecord'])"));
		for(WebElement chkBox:chkBoxes)
		chkBox.click();
	}
}
