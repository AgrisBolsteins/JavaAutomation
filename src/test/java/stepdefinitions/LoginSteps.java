package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

import general.User;
import pages.login.LoginPageObject;

public class LoginSteps {

    private LoginPageObject loginPage = new LoginPageObject();
    private User user2 = new User();
    
    @And("^I enter login email address$")
    public void iEnterLoginEmailAddress() throws Throwable {
        System.out.println("ENTER LOGIN EMAIL");
        loginPage.enterEmail(user2.getEmailAddress());
    }

    @And("^I enter login password$")
    public void iEnterLoginPassword() throws Throwable {
        System.out.println("ENTER LOGIN PASSWORD");
        loginPage.enterPassword(user2.getPassword());
    }

    @And("^I check Remember me checkbox$")
    public void iCheckRememberMeCheckbox() throws Throwable {
        System.out.println("CHECK REMEMBER ME");
        loginPage.selectRememberMeTick();
    }

    @And("^I select validate LOGIN button$")
    public void iSelectValidateLOGINButton() throws Throwable {
        System.out.println("SELECT VALIDATE LOGIN BUTTON");
        loginPage.selectValidateLoginButton();
    }

}
