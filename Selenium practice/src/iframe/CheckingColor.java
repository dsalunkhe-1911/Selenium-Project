package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckingColor {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/slider/#colorpicker");
			driver.manage().window().maximize();
		
		WebElement iframe=driver.findElement(By.xpath("//*[@class='demo-frame']"));
			driver.switchTo().frame(iframe);
        WebElement colorAddress=driver.findElement(By.cssSelector("#red div"));
        String colorValueRgb=colorAddress.getCssValue("color");
        System.out.println(colorValueRgb);
   }
}
