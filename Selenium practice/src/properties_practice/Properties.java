package properties_practice;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties {
	public static void main(String args[])throws  IOException {
			System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			FileInputStream load=new FileInputStream("C:\\Users\\admin\\eclipse-workspace1\\Selenium practice\\config.properties");
			Properties prop=new Properties();
			prop.load(load);
			WebDriver driver=new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			
			driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.id("btnLogin")).click();
		}

		private void load(FileInputStream load) {
			
		}

		private String getProperty(String string) {
			return null;
		}
	}



