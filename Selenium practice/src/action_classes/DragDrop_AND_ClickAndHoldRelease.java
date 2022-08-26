package action_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_AND_ClickAndHoldRelease {
	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			
			WebElement drag1=driver.findElement(By.xpath("//li[@id='credit2']"));
			WebElement drag2=driver.findElement(By.xpath("//li[@id='credit1']"));
			WebElement drag3=driver.findElement(By.xpath("//li[@id='fourth']//a"));
					
					
			WebElement drop1=driver.findElement(By.xpath("//ol[@id='bank']//li"));
			WebElement drop2=driver.findElement(By.xpath("//ol[@id='loan']//li"));
			WebElement drop3=driver.findElement(By.xpath("//ol[@id='amt7']//li"));
			WebElement drop4=driver.findElement(By.xpath("//ol[@id='amt8']//li"));
			
			Actions action=new Actions(driver);
			action.dragAndDrop(drag1, drop1).perform();
			action.dragAndDrop(drag2, drop2).perform();
			action.dragAndDrop(drag3, drop3).perform();
			action.clickAndHold(drag3).build().perform();
			action.moveToElement(drop4).build().perform();
			action.release(drop4).build().perform();
	}
}
