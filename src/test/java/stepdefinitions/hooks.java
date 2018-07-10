package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.After;



public class hooks {

    @Before
    public void launchBrowser() {
        System.out.println("LAUNCH CHROME");
    }

    @After
    public void closeBrowser () {
        System.out.printf("CLOSE BROWSER");
    }
}