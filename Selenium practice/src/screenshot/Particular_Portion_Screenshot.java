package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Particular_Portion_Screenshot {

	public static void main(String args[])throws IOException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			driver.manage().window().maximize();
			
			WebElement ss=driver.findElement(By.xpath("//*[name()='image'and contains(@overflow,'visible')]"));
            File source = ss.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\admin\\Pictures\\ORANGE_HRM_Screenshots.png");
			FileHandler.copy(source, destination);
		    driver.quit();
	}
}
