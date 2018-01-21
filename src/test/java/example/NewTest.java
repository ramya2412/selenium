package example;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.get("http://demo.guru99.com/test/guru99home/");
	  Thread.sleep(3000);
	  System.out.println("guru home is opened");
	  String title = driver.getTitle();			
	  System.out.println("tite of page is"+title);
		assertTrue(title.contains("Demo Guru99 Page")); 
		System.out.println("test is successfully executed");
		System.out.println("test 1 is passed");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  System.out.println("firefox opened");
	  System.out.println("before test is passed");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
