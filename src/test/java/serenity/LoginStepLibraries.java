package serenity;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepLibraries {
    LoginPage loginPage;
    HomePage homePage;

    @Step
    public void login(String username, String password) throws InterruptedException {
        loginPage.setUser(username);
        loginPage.setPassword(password);
        loginPage.login();
    }

    @Step
    public boolean checkInvalid(String message) {
        Alert alert = loginPage.checkAlert();
        if (alert.getText().equals(message)) {
            alert.accept();
            return true;
        } else {
            return false;
        }
    }


}
