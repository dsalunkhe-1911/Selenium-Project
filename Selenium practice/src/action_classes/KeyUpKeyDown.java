package action_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpKeyDown {
	public static void main(String args[])throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	WebElement textfield=driver.findElement(By.id("email"));
		Actions act=new Actions(driver);
act.sendKeys(textfield,"Dhanashri").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(2000);
		
		 WebElement textpass=driver.findElement(By.id("pass"));
	     textpass.click();
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	      Thread.sleep(2000);
	     
	  }
}



