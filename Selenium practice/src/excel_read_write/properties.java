package excel_read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class properties {
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
		// TODO Auto-generated method stub
		
	}

	private CharSequence getProperty(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
