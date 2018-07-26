package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.User;
import pages.signup.SignupPageObject;

import static utils.RandomGenerator.generateRandomEmail;
import static utils.RandomGenerator.generateRandomPhoneNumber;
import static utils.RandomGenerator.generateRandomString;



public class SignupStep {

    private SignupPageObject signupPage = new SignupPageObject();
    private User user = new User();
    private User userTwo = new User("Janis", "Berzins");

    // positive steps

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        System.out.println("ENTER FIRST NAME");
        signupPage.enterFirstName(user.getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        System.out.println("ENTER LAST NAME");
        signupPage.enterLastName(user.getLastName());
    }

    @And("^I enter mobile phone number$")
    public void iEnterMobilePhoneNumber() throws Throwable {
        System.out.println("ENTER MOBILE NUMBER");
        signupPage.enterMobileNumber(user.getMobileNumber());
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() throws Throwable {
        System.out.println("ENTER EMAIL ADDRESS");
        signupPage.enterEmail(user.getEmailAddress());
    }

    @And("^I enter password$")
    public void iEnterPassword() throws Throwable {
        System.out.println("ENTER PASSWORD");
        signupPage.enterPassword(user.getPassword());
    }

    @And("^I confirm password$")
    public void iConfirmPassword() throws Throwable {
        System.out.println("CONFIRM PASSWORD");
        signupPage.enterConfirmPassword(user.getPassword());
    }

    @And("^I select validate sign-up button$")
    public void iSelectSignUpButton() throws Throwable {
        System.out.println("SELECT VALIDATE SIGN-UP BUTTON");
        signupPage.selectValidateSignupButton();
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
