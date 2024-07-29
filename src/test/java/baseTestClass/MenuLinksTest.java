package baseTestClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MenuLinksTest extends BaseTest {

 @Test
 public void testMenuLinks() throws InterruptedException {
     driver.get("https://automationpanda.com/");
     //Click on About Button
     WebElement About = driver.findElement(By.xpath("//*[@id=\"menu-item-9\"]/a"));
     About.click();
     Thread.sleep(3000);
     String expectedTitle = "About | Automation Panda";
     assertEquals(driver.getTitle(), expectedTitle,"About page failed");
     
     //Click on Contact Button
     
     WebElement Contact = driver.findElement(By.xpath("//*[@id=\"menu-item-10\"]/a"));
     Contact.click();
     Thread.sleep(3000);
//     String title=driver.getTitle();
//     System.out.println(title);

     String expectedTitle1 = "Contact | Automation Panda";
     assertEquals(driver.getTitle(), expectedTitle1,"Contact page failed");
     
     
     /*String title=driver.getTitle();
     System.out.println(title);
    Click on the first menu link and validate submenu links
     WebElement firstMenuLink = driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/span/svg"));
     firstMenuLink.click();
     Thread.sleep(3000);*/
     

//     WebElement firstSubMenuLink = driver.findElement(By.cssSelector("cssSelectorForFirstSubMenuLink"));
//     firstSubMenuLink.click();
//     String expectedTitle = "Expected SubMenu Page Title";
//     assertEquals(driver.getTitle(), expectedTitle, "SubMenu Page title validation failed");
//     // Return to home page
//     driver.findElement(By.cssSelector("cssSelectorForHomePageLink")).click();
 }
}
