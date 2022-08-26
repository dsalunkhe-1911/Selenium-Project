package action_classes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPOP_UP {

	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://groww.in/");
			driver.manage().window().maximize();
		
			String winId1=driver.getWindowHandle();
			driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
			Thread.sleep(2000);
			Set<String>winId2=driver.getWindowHandles();
			int a=winId2.size();
			if(a==1) {
				driver.findElement(By.id("login_email1")).sendKeys("Dhanashri");
	        }
			else {
				for(String winId:winId2){
				if(!(winId==winId1)) {
					driver.switchTo().window(winId);
					driver.findElement(By.id("login_email1")).sendKeys("Dhanashri");
				}
			}
		}
	}
}
	
