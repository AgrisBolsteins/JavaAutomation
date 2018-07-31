package pages.account;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.header.NavigationPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AccountPageObject {

    private SelenideElement myProfileButton() {
        return $("test");
    }
    private SelenideElement getlogOutButton() { return $("test"); }
    private SelenideElement getADDbutton() { return $("test"); }

    public void visibleProfileButton() {
        myProfileButton().shouldBe(Condition.visible);
    }

    public NavigationPageObject selectLogOutButton() {
        getlogOutButton().click();
        return page(NavigationPageObject.class);
    }

    public void selectADDbutton() {
        getADDbutton().click();
    }


}