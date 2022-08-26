package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Taking_screenshot {
	
	public static void main(String args[])throws IOException,InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();
			
			//Full Page Screenshot
			TakesScreenshot ts = (TakesScreenshot)driver;
	
        File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\admin\\Pictures\\Screenshots.png");
		FileHandler.copy(source, destination);
		Thread.sleep(2000);
		driver.quit();
	}
}
