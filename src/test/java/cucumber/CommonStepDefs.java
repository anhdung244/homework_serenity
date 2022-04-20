package cucumber;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import serenity.CommonStepLibraries;

import static org.hamcrest.MatcherAssert.assertThat;

public class CommonStepDefs {
    @Steps
    CommonStepLibraries commonStepLibraries;

    @Then("the user is at {string} page")
    public void the_user_is_at_page(String page) {
        assertThat("The " + page + " is NOT available", commonStepLibraries.isAt(page));

    }


}
