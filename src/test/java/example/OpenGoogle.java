package example;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenGoogle {
WebDriver driver;
@Test
public void test() throws InterruptedException{
	driver=new FirefoxDriver();
	driver.navigate().to("www.google.com");
	Thread.sleep(3000);
	System.out.println("google is opened");
	String title=driver.getTitle();
	if(title.contains("Google")){
		System.out.println("ttle matches"+title);
		driver.quit();
	}
	
}
}
