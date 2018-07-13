package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class landingScreenSteps {

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("OPEN HOMEPAGE");
        openedHomepage();
    }

    @When("^I select my acc menu$")
    public void iSelectMyAccMenu() throws Throwable {
        System.out.println("SELECT ACCOUNT MENU");
        selectMyAccountMenu();
    }

    @And("^I select sign-up button$")
    public void iSelectSignUpButton() throws Throwable {
        System.out.println("SELECT SIGN UP BUTTON");
        selectSignUpButton();
    }

    @And("^I select login button$")
    public void iSelectLoginButton() throws Throwable {
        System.out.println("SELECT LOGIN BUTTON");
        selectLoginButton();
    }
}
