package testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTest {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
	     WebDriver driver = new ChromeDriver();
			 
			 driver.get("https://www.facebook.com/login/");
		     Thread.sleep(2000);
	         driver.manage().window().maximize();
	         driver.navigate().to("https://opensource-demo.orangehrmlive.com/");  
	         Thread.sleep(2000);
	         driver.quit();
	        // driver.close();
		}

}
