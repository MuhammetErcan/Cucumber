package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;
    private static ThreadLocal<WebDriver>drivers=new ThreadLocal<>();


    public static WebDriver getDriver(){
        return getDriver("chrome");
    }

    public static WebDriver getDriver(String browser){
        if (drivers.get()==null){
         switch (browser){
             case "chrome":
                 WebDriverManager.chromedriver().setup();
                 drivers.set(new ChromeDriver());
                 break;
             case "firefox":
                 WebDriverManager.firefoxdriver().setup();
                 drivers.set(new FirefoxDriver());
                 break;
             case "edge":
                 WebDriverManager.edgedriver().setup();
                 drivers.set(new EdgeDriver());
                 break;
             default:WebDriverManager.chromedriver().setup();
             drivers.set(new ChromeDriver());
         }
        }
        return drivers.get();
    }

    public static void quitDriver(){
        if (drivers.get()!=null){
            drivers.get().quit();
            drivers.set(null);
        }
    }

}
