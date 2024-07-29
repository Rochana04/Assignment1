package baseTestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilityClasses.ReadConfig;

public class BaseTest {
 WebDriver driver;
 ReadConfig config = new ReadConfig();

 @BeforeMethod
 public void setUp() {
     String browser = config.getBrowser();
     if (browser.equals("chrome")) {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROCHHS\\eclipse-workspace\\First\\driver\\chromedriver.exe");
         driver = new ChromeDriver();
     } else if (browser.equals("firefox")) {
         System.setProperty("webdriver.edge.driver", "C:\\Users\\ROCHHS\\eclipse-workspace\\First\\driver\\msedgedriver.exe");
         driver = new FirefoxDriver();
     }
     driver.manage().window().maximize();
 }

 @AfterMethod
 public void tearDown() {
     if (driver != null) {
         driver.quit();
     }
 }
}
