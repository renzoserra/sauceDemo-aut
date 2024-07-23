package steps;

import io.cucumber.java.en.Given;
import utils.BasePages;
import utils.TestBase;

public class SauceDemoSteps extends TestBase {


    @Given("Ingreso a la web {string}")
    public void ingresoALaWeb(String arg0) {
        sauceDemoHomePage.goToUrlSauceDemo(arg0);
    }
}
