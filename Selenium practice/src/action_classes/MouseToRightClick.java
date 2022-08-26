package action_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseToRightClick {
	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			driver.manage().window().maximize();
			
			WebElement target=driver.findElement(By.xpath("//span[text()='right click me']"));
			Actions act=new Actions(driver);
			act.contextClick(target).perform();
	}
}
