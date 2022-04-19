package cucumber;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.WebDriver;

public class Hooks extends PageObject {
    @Before
    public void setUp() {
        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        String driverRunning = environmentVariables.getProperty("webdriver.driver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = getDriver();
        open();
        driver.manage().window().maximize();
    }
}
