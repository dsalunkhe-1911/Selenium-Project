package action_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {
	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();
			
			WebElement hoverpt=driver.findElement(By.xpath("//a[contains(text(),'Women']"));
			Actions act=new Actions(driver);
			act.moveToElement(hoverpt).perform();
	}

}
