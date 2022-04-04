package gun01;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyStepdefs1 {

    String str="a";

    @Then("login form should be visible")
    public void loginFormShouldBeVisible() {
        Assert.assertEquals(str,"a");
    }

    @Given("user on home page")
    public void userOnHomePage() {
        System.out.println("User on home page");
    }

    @When("user clicks to login button")
    public void userClicksToLoginButton() {
        System.out.println("User set str as a ");
    }


    @Given("user on home page senario")
    public void userOnHomePageSenario() {
    }

    @And("user goes to login form")
    public void userGoesToLoginForm() {
    }

    @When("user input username")
    public void userInputUsername() {
    }

    @And("user input password")
    public void userInputPassword() {
    }

    @Then("page title should be My account")
    public void pageTitleShouldBeMyAccount() {
    }

    @And("My Account page should be visible")
    public void myAccountPageShouldBeVisible() {
    }
}
