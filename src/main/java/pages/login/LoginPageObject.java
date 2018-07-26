package pages.login;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageObject {

    private SelenideElement getEmailField() {
        return $("test");
    }

    private SelenideElement getPasswordField() {
        return $("test");
    }

    private SelenideElement getRememberMeTick() {
        return $("test");
    }

    private SelenideElement getLoginButton() {
        return $("test");
    }

    private SelenideElement getSignupButton() {
        return $("test");
    }

    private SelenideElement getForgetPasswordButton() {
        return $("test");
    }
}
