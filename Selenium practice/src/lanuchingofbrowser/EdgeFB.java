package lanuchingofbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeFB {
	public static void main(String args[]) {
		System.setProperty("webdriver.edge.driver",
				"E:\\Users\\admin\\Downloads\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
	}

}
