package pages.login;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageObject {

    // Login page elements

    private SelenideElement getEmailField() {
        return $("test");
    }
    private SelenideElement getPasswordField() {
        return $("test");
    }
    private SelenideElement getRememberMeTick() {
        return $("test");
    }
    private SelenideElement getValidateLoginButton() {
        return $("test");
    }

    // Login page action methods

    public void enterEmail(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public void selectRememberMeTick() {
        getRememberMeTick().click();
    }

    public AccountPageObject selectValidateLoginButton() {
        getValidateLoginButton().click();
        return page(AccountPageObject.class);
    }

}
