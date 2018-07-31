package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.header.NavigationPageObject;

public class landingScreenSteps {

    private NavigationPageObject homePage = new NavigationPageObject();

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("OPEN HOMEPAGE");
        homePage.visibleMyAccountButton();
    }

    @When("^I select my acc menu$")
    public void iSelectMyAccMenu() throws Throwable {
        System.out.println("SELECT ACCOUNT MENU");
        homePage.selectMyAccountButton();
    }

    @And("^I select sign-up button$")
    public void iSelectSignUpButton() throws Throwable {
        System.out.println("SELECT SIGN UP BUTTON");
        homePage.selectSignupButton();
    }

    @And("^I select login button$")
    public void iSelectLoginButton() throws Throwable {
        System.out.println("SELECT LOGIN BUTTON");
        homePage.selectLoginButton();
    }

    @Then("^Navigation page is opened$")
    public void navigationPageIsOpened() throws Throwable {
        System.out.println("LANDING SCREEN IS OPENED");
        homePage.visibleMyAccountButton();
    }
}
