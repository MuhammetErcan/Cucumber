package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

public class ParentClass {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public ParentClass(){
        driver= Driver.getDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void gotoUrl(String url){
        driver.get(url);
    }

    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void clickTo(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void sendKeys(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public void waitFor(By locator, WaitConditions waitConditions){
        switch (waitConditions){
            case exist:
                wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                break;
            case visible:
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                break;
            case clickable:
                wait.until(ExpectedConditions.elementToBeClickable(locator));
                break;
        }
    }

    public void scrollToLocator(By locator){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",locator);
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    public boolean isExist(By locator){
        return driver.findElements(locator).size()>0;
    }

    public void verifyTextIn(By locator, String text){
        WebElement notification=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(notification.getText().toLowerCase(Locale.ROOT).contains(text.toLowerCase(Locale.ROOT)));
    }

    public void hoverWithElement(WebElement element, long milis){
        new Actions(driver).moveToElement(element).pause(milis).build().perform();
    }
    public void hoverWithElement(WebElement element){
        hoverWithElement(element,10);
    }

    public void hoverWithLocator(By locator){
        List<WebElement>list=driver.findElements(locator);
        for (WebElement element:list) {
            new Actions(driver).moveToElement(element).build().perform();
        }
    }

}
