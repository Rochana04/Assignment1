package utilityClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
 Properties properties;

 public ReadConfig() {
     try {
         FileInputStream fis = new FileInputStream("C:\\Users\\ROCHHS\\eclipse-workspace\\First\\Configuration\\config.properties");
         properties = new Properties();
         properties.load(fis);
     } catch (IOException e) {
         e.printStackTrace();
     }
 }

 public String getBrowser() {
     return properties.getProperty("browser");
 }

 public String getUrl() {
     return properties.getProperty("url");
 }
 
 public String getSnapdealUrl() {
     return properties.getProperty("snapdealUrl");
 }

public String getorangehrmUrl() {
	 return properties.getProperty("orangehrmUrl");
}
}
