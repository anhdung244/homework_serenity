package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageObject {

    WebDriver driver;
    @FindBy(css = "input[name='uid']")
    private WebElementFacade username;

    @FindBy(css = "input[name='password']")
    private WebElementFacade password;

    @FindBy(css = "input[value='LOGIN']")
    private WebElementFacade btnLogin;


    public void setUser(String user) {
        username.waitUntilVisible().then().type(user);

    }

    public void setPassword(String pass) {
        password.waitUntilVisible().then().type(pass);
    }

    public void login() {
        btnLogin.waitUntilVisible().then().click();
    }

    public Alert checkAlert() {
        return getAlert();
    }


}
