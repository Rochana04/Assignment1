package baseTestClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilityClasses.ExcelUtils;

public class HRMlogin extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        ExcelUtils.setExcelFile("C:\\Users\\ROCHHS\\eclipse-workspace\\First\\Configuration\\data.xlsx", "Sheet1");
        int rowCount = ExcelUtils.getSheet().getPhysicalNumberOfRows();
        Object[][] data = new Object[rowCount - 1][2];
        for (int i = 1; i < rowCount; i++) {
            data[i - 1][0] = ExcelUtils.getCellData(i, 0);
            data[i - 1][1] = ExcelUtils.getCellData(i, 1);
        }
        return data;
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) throws InterruptedException {
        driver.get(config.getorangehrmUrl());
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Wait for the logged-in text to be visible
        String xpathForLoggedInText = "//h6[contains(@class, 'oxd-topbar-header-breadcrumb-module') and text()='Dashboard']";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100)); // 10 seconds wait
        WebElement dashboardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathForLoggedInText)));
        
        // Validate the logged-in text
        String expectedLoggedInText = "Dashboard";
        assertTrue(dashboardElement.getText().equals(expectedLoggedInText), "Login validation failed");
//        WebElement ele = driver.findElement(By.xpath("//h6[contains(@class, 'oxd-topbar-header-breadcrumb-module') and text()='Dashboard']")); 
//        String text = ele.getText();
//	    System.out.println(text);
//        System.out.println(title);
//        driver.findElement(By.name("password")).sendKeys(password);
//        driver.findElement(By.tagName("button")).click();
//
        // Validate if user is logged in by checking for a specific element
       // String expectedLoggedInText = "Dashboard";
        //String xpathForLoggedInText = "//h6[contains(@class, 'oxd-topbar-header-breadcrumb-module') and text()='Dashboard']";
       // assertTrue(driver.findElement(By.xpath("//h6[contains(@class, 'oxd-topbar-header-breadcrumb-module') and text()='Dashboard']")).isDisplayed(), "Login validation failed");
}
}