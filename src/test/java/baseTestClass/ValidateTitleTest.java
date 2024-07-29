package baseTestClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ValidateTitleTest extends BaseTest {

 @Test
 public void testValidateTitle() {
     driver.get(config.getUrl());
     String expectedTitle = "Google";
     String actualTitle = driver.getTitle();
     assertEquals(actualTitle, expectedTitle, "Title validation failed");
     System.out.println("Page Title: " + actualTitle);
     System.out.println("Current URL: " + driver.getCurrentUrl());
 }
}
