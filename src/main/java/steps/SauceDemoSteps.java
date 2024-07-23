package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BasePages;
import utils.TestBase;

public class SauceDemoSteps extends TestBase {


    @Given("Ingreso a la web {string}")
    public void ingresoALaWeb(String arg0) {
        sauceDemoHomePage.goToUrlSauceDemo(arg0);
    }

    @When("Ingreso credenciales validas {string} y {string}")
    public void ingresoCredencialesValidasY(String arg0, String arg1) {
        sauceDemoHomePage.typeCredentials(arg0,arg1);
    }

    @And("Hago click en el boton login")
    public void hagoClickEnElBotonLogin() {
        sauceDemoHomePage.botonLogin(true);
    }

    @Then("Visualizo que estoy en la web con el endpoint {string}")
    public void visualizoQueEstoyEnLaWebConElEndpoint(String arg0) {
            BasePages.validateUrl(arg0);
    }

    @And("Visualizo titulo seccion {string}")
    public void visualizoTituloSeccion(String arg0) {

    }
}
