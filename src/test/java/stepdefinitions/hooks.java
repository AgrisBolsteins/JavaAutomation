package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.After;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;


public class hooks {

    @Before
    public void launchBrowser() {
        System.setProperty("selenide.browser", FIREFOX);
    }

    @Before
    public void openHomePage() {
        open("https://www.phptravels.net/");
    }

    @After
    public void closeBrowser () {
        close();
    }
}