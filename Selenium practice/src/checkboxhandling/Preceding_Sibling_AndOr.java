package checkboxhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Preceding_Sibling_AndOr {
	public static void main(String args[])throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
	     driver.manage().window().maximize();
        //xpath using logical 'and' operator
         driver.findElement(By.xpath("//input[@id='txtUsername' and @type='text']")).sendKeys("Admin");
        //xpath using logical 'and' operator
	     driver.findElement(By.xpath("//input[@id='txtPassword' or @type='password']")).sendKeys("admin123");
	     driver.findElement(By.className("button")).click();
	     driver.findElement(By.xpath("//*[text()='PIM']")).click();
	     //Use of parent with preceding and sibling
driver.findElement(By.xpath("//table//tbody//tr//td//a[text()='0272']//parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
        Thread.sleep(2000);
       //Use of other parent with preceding and sibling statement then unclick 0272 and click Jadine show process
driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td/a[text()='Jadine']"
		+ "//parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
       Thread.sleep(2000);
       driver.close();
	}
	
}
