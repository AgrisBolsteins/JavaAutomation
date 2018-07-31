package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.account.AccountPageObject;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class AccountSteps {

    private AccountPageObject accountPage = new AccountPageObject();

    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT OPENED");
        accountPage.visibleProfileButton();
    }

    @And("^I select select logOut button$")
    public void iSelectSelectLogOutButton() throws Throwable {
        System.out.println("SELECT LOGOUT BUTTON");
        accountPage.selectLogOutButton();
    }

    @And("^I select ADD menu$")
    public void iSelectADDMenu() throws Throwable {
        System.out.println("SELECT ADD BUTTON");
        accountPage.selectADDbutton();
    }
}
