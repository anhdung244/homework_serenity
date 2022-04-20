package serenity;


import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.LoginPage;

public class CommonStepLibraries {
    HomePage homePage;
    LoginPage loginPage;

    @Step
    public boolean isAt(String page) {
        if (page.equals("Home")) {
            return homePage.isAt();
        } else if (page.equals("Login")) {
            return loginPage.isAt();
        }
        return false;
    }


}
