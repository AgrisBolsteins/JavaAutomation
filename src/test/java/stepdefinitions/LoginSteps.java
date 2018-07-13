package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    // positive steps
    
    @And("^I enter login email address$")
    public void iEnterLoginEmailAddress() throws Throwable {
        System.out.println("ENTER LOGIN EMAIL");
        enterLoginEmailAddress();
    }

    @And("^I enter login password$")
    public void iEnterLoginPassword() throws Throwable {
        System.out.println("ENTER LOGIN PASSWORD");
        enterLoginPassword();
    }

    @And("^I select validate LOGIN button$")
    public void iSelectValidateLOGINButton() throws Throwable {
        System.out.println("SELECT VALIDATE LOGIN BUTTON");
        selectValidateLOGINButton();
    }

    //negative steps

    @And("^I enter wrong login email address$")
    public void iEnterWrongEmailAddress() throws Throwable {
        System.out.println("ENTER LOGIN WRONG EMAIL");
        enterWrongEmailAddress();
    }

    @And("^I enter wrong login password$")
    public void iEnterWrongPassword() throws Throwable {
        System.out.println("ENTER WRONG LOGIN PASSWORD");
        enterWrongPassword();
    }

    @Then("^Unsuccessful login error message is displayed$")
    public void unsuccessfulLoginErrorMessageIsDisplayed() throws Throwable {
        System.out.println("UNSUCCESSFUL LOGIN");
        unsuccessfulLoginError();
    }
}
