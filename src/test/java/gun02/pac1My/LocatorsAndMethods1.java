package gun02.pac1My;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.ParentClass;

import java.util.Locale;

public class LocatorsAndMethods1 extends ParentClass {

    By lMyAccountButton=By.cssSelector("a[title='My Account']");
    By lLoginButton=By.xpath("//a[text()='Login']");
    By lUserNameEmail=By.cssSelector("input[name='email']");
    By lPassword=By.cssSelector("input[name='password']");
    By lLoginSubmitButton=By.cssSelector("input[value='Login']");
    By lLogout=By.xpath("//a[text()='Logout']");
    By lEditAccount=By.xpath("//a[text()='Edit Account']");
    By lTelephoneInput=By.cssSelector("input[name='telephone']");
    By lContinueButton=By.cssSelector("input[value='Continue']");
    By lAssert1=By.cssSelector("div[class='alert alert-success alert-dismissible']");
    By lnewsletter=By.xpath("//a[text()='Newsletter']");
    By lYesButton=By.xpath("//input[@value='1']");
    By lContinueNewLetter=By.cssSelector("input[value='Continue']");
    By lassertNewletter=By.cssSelector("div[class='alert alert-success alert-dismissible']");




    public void goToUrl(){
        gotoUrl("https://opencart.abstracta.us/index");
    }

    public void login(){
        clickTo(lMyAccountButton);
        clickTo(lLoginButton);
        sendKeys(lUserNameEmail,"ali@gmail.com");
        sendKeys(lPassword,"123456");
        clickTo(lLoginSubmitButton);
    }

    public void assertLogin(){
        wait.until(ExpectedConditions.presenceOfElementLocated(lLogout));
    }

    public void goToEditAccount(){
        clickTo(lEditAccount);
    }
    public void chaneTelephoneNumberWith(String text) {
        sendKeys(lTelephoneInput,text);
        clickTo(lContinueButton);
    }
    public void assertChange() {
        Assert.assertTrue(driver.findElement(lAssert1).getText().toLowerCase(Locale.ROOT).contains("successfully "));
    }
    public void goToNewsletter() {
        clickTo(lnewsletter);
    }
    public void changeButton() {
        clickTo(lYesButton);
        clickTo(lContinueNewLetter);
    }

    public void assertChangeNewsletter() {
        Assert.assertTrue(driver.findElement(lassertNewletter).getText().toLowerCase(Locale.ROOT).contains("successfully "));
    }

}
