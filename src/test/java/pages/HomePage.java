package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

    @FindBy(css = ".heading3")
    private WebElementFacade welcomeText;

    public boolean isAt() {
        return welcomeText.isDisplayed();
    }

}

