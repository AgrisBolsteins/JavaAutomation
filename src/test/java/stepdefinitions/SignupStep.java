package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupStep {

    // positive steps

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

    @And("^I confirm password$")
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

    // negative steps

    @And("^I enter unformatted email address$")
    public void iEnterUnformattedEmailAddress() throws Throwable {
        System.out.println("UNFORMATTED EMAIL ADDRESS");
        unformattedEmailAddress();
    }

    @And("^I enter unformatted password$")
    public void iEnterUnformattedPassword() throws Throwable {
        System.out.println("UNFORMATTED PASSWORD");
        unformattedPassword();
    }

    @Then("^Unsuccessful sign-up error message is displayed$")
    public void unsuccessfulSignUpErrorMessageIsDisplayed() throws Throwable {
        System.out.println("SIGN-UP ERROR MESSAGE");
        signupErrorMessage();
    }
}
