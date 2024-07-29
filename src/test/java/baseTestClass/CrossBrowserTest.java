package baseTestClass;

import static org.testng.Assert.assertEquals;

//CrossBrowserTest.java
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest extends BaseTest {

 @Test(invocationCount = 3)
 public void testCrossBrowser() {
     // Chrome
     driver.get(config.getUrl());
     assertEquals(driver.getTitle(), "Google", "Chrome: Title validation failed");
     driver.quit();
     
//     // Firefox
//     System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
//     driver = new FirefoxDriver();
//     driver.get(config.getUrl());
//     assertEquals(driver.getTitle(), "Google", "Firefox: Title validation failed");
//     driver.quit();
     
     // Edge
     System.setProperty("webdriver.edge.driver", "C:\\Users\\ROCHHS\\eclipse-workspace\\First\\driver\\msedgedriver.exe");
     driver = new EdgeDriver();
     driver.get(config.getUrl());
     assertEquals(driver.getTitle(), "Google", "Edge: Title validation failed");
     driver.quit();
 }
}
