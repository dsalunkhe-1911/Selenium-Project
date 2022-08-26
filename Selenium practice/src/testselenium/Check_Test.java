package testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
*@author dhanashri salunkhe
*@description
*@date 26 Jul 2022
*/

public class Check_Test {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
	     WebDriver driver = new ChromeDriver();
			 
			 driver.get("https://www.facebook.com/login/");//use to launch URL
		     Thread.sleep(2000);
	         driver.manage().window().maximize();
	         driver.navigate().to("https://opensource-demo.orangehrmlive.com/");//use to launch URL
	         driver.navigate().back();   //use to navigate previous page
	         driver.navigate().forward(); //use to navigate forward page
	         driver.navigate().refresh();  //use to navigate refresh page
	         Thread.sleep(2000);
	         driver.quit();  //close entire browser
	        // driver.close(); //close only current tab
		}

}


