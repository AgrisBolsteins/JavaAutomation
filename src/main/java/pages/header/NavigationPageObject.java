package pages.header;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.login.LoginPageObject;
import pages.signup.SignupPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    // page elements

    private SelenideElement getMyAccountButton() {
        return $("test");
    }
    private SelenideElement getSignupButton() {
        return $("test");
    }
    private SelenideElement getLoginButton() {
        return $("test");
    }

    // Landing page action methods

    public void selectMyAccountButton() {
        getMyAccountButton().click();
    }

    public SignupPageObject selectSignupButton() {
        getSignupButton().click();
        return page(SignupPageObject.class);
    }

    public LoginPageObject selectLoginButton() {
        getLoginButton().click();
        return page(LoginPageObject.class);
    }

    public void visibleMyAccountButton() {
        getMyAccountButton().shouldBe(Condition.visible);
    }
 }
