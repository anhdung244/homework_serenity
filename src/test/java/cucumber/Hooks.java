package cucumber;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class Hooks extends PageObject {
    @Before
    public void setUp() {
//        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
//        String driverRunning = environmentVariables.getProperty("driver");
//
//
//        switch (driverRunning) {
//            case "firefox":
//                WebDriverManager.firefoxdriver().setup();
//                break;
//            case "chrome":
//            default:
//                WebDriverManager.chromedriver().setup();
//                break;
//
//
//        }

        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        String driverRunning = environmentVariables.getProperty("webdriver.driver");
        WebDriverManager.chromedriver().setup();
        open();
        getDriver().manage().window().maximize();
    }
}
