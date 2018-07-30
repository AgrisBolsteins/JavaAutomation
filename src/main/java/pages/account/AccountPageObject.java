package pages.account;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AccountPageObject {

    private SelenideElement myProfileButton() {
        return $("test");
    }

    public void visibleProfileButton() {
        myProfileButton().shouldBe(Condition.visible);
    }
}
