package serenity;


import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class CommonStepLibraries {
    HomePage homePage;

    @Step
    public boolean isAt(String page) {
        if (page.equals("Home")) {
            return homePage.isAt();
        }
        return false;
    }


}
