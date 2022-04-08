package gun02.pac1My;

import gun02.pac1My.LocatorsAndMethods1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    LocatorsAndMethods1 locatorsAndMethods1=new LocatorsAndMethods1();

    @Given("open site")
    public void openSite() {
        locatorsAndMethods1.goToUrl();
    }

    @When("login account")
    public void loginAccount() {
        locatorsAndMethods1.login();
    }

    @Then("assert login")
    public void assertLogin() {
        locatorsAndMethods1.assertLogin();
    }

    @Given("go to edit acconut")
    public void goToEditAcconut() {
        locatorsAndMethods1.goToEditAccount();
    }

    @When("chane telephone number with {string}")
    public void chaneTelephoneNumberWith(String text) {
        locatorsAndMethods1.chaneTelephoneNumberWith(text);
    }

    @Then("assert change")
    public void assertChange() {
        locatorsAndMethods1.assertChange();
    }

    @Given("go to newsletter")
    public void goToNewsletter() {
        locatorsAndMethods1.goToNewsletter();
    }

    @When("change button")
    public void changeButton() {
        locatorsAndMethods1.changeButton();
    }

    @Then("assert change Newsletter")
    public void assertChangeNewsletter() {
        locatorsAndMethods1.assertChangeNewsletter();
    }

}
