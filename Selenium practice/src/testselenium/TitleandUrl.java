package testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleandUrl {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
		     WebDriver driver = new ChromeDriver();
				 
				
		     driver.navigate().to("https://opensource-demo.orangehrmlive.com/");//use to launch URL
		     driver.manage().window().maximize();
		         
		         String title=driver.getTitle();
		         String url=driver.getCurrentUrl(); 
		        System.out.println(title);
		        System.out.println(url);
			}

	}



