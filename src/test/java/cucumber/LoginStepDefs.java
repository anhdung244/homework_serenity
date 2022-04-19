package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import serenity.LoginStepLibraries;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginStepDefs {
    @Steps
    LoginStepLibraries loginStepLibraries;

//    @Given("the user enters the username {string} and password {string}")
//    public void the_user_enters_the_username_and_password(String username, String password) {
//        loginStepLibraries.login(username, password);
//    }

    @Given("^the user enters the username (.+) and password (.+)$")
    public void the_user_enters_the_username_and_password(String username, String password) {
        loginStepLibraries.login(username, password);
    }


    @Then("the error message {string} is displayed")
    public void the_error_message_user_is_not_valid_is_displayed(String message) {
        assertThat("The " + message + "is wrong", loginStepLibraries.checkInvalid(message));

    }


}

