package baseTestClass;

import org.testng.annotations.Test;

public class OpenCloseBrowserTest extends BaseTest {

 @Test
 public void testOpenCloseBrowser() {
     driver.get(config.getUrl());
 }
}
