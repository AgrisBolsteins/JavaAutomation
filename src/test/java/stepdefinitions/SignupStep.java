package stepdefinitions;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupStep {
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

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        System.out.println("ENTER FIRST NAME");
        enterFirstName();
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        System.out.println("ENTER LAST NAME");
        enterLastName();
    }

    @And("^I enter mobile phone number$")
    public void iEnterMobilePhoneNumber() throws Throwable {
        System.out.println("ENTER MOBILE NUMBER");
        enterMobilePhoneNumber();
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() throws Throwable {
        System.out.println("ENTER EMAIL ADDRESS");
        enterEmailAddress();
    }

    @And("^I enter password$")
    public void iEnterPassword() throws Throwable {
        System.out.println("ENTER PASSWORD");
        enterPassword();
    }

    @And("^confirm password$")
    public void iConfirmPassword() throws Throwable {
        System.out.println("CONFIRM PASSWORD");
        confirmPassword();
    }

    @And("^I select sign up button$")
    public void iSelectSignUpButton() throws Throwable {
        System.out.println("SELECT SIGNUP BUTTON");
        selectSignUpButton();
    }

    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT OPENED");
        accountPageIsOpened();
    }
}
