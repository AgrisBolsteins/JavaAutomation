package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.After;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;
import static org.openqa.selenium.remote.BrowserType.FIREFOX_CHROME;


public class hooks {

    @Before
    public void launchBrowser() {
        System.setProperty("selenide.browser", CHROME);
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