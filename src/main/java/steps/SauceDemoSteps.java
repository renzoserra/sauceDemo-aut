package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
        switch (arg0){
            case "Products":
                sauceDemoInventoryPage.validateTitlePage(arg0);
                break;
            case "Your Cart":
                sauceDemoCartPage.validateTitlePage(arg0);
                break;
            case "Checkout: Your Information":
                sauceDemoCheckoutOnePage.validateTitlePage(arg0);
                break;
            case "Checkout: Overview":
                break;
            case "Checkout: Complete!":
                break;
            default:
                Assert.fail("El titulo no forma parte de las opciones a validar");
        }

    }

    @And("Agrego {string} productos al azar carrito de compras")
    public void agregoProductosAlAzarCarritoDeCompras(String arg0) {
        sauceDemoInventoryPage.addItemsToCart(Integer.parseInt(arg0));
    }

    @And("Hago click en el boton del carrito")
    public void hagoClickEnElBotonDelCarrito() {
        sauceDemoInventoryPage.botonLogin(true);
    }

    @And("Valido que carrito contiene {int} productos en el carrito")
    public void validoQueCarritoContieneProductosEnElCarrito(int arg0) {
        sauceDemoCartPage.validateItemsInCart(arg0);
    }

    @And("Hago click en el boton {string}")
    public void hagoClickEnElBoton(String arg0) {
        switch (arg0){
            case "Checkout":
                sauceDemoCartPage.botonCheckout(true);
                break;
            case "Continue":
                sauceDemoCheckoutOnePage.botonContinue(true);
                break;
            case "Finish":
                break;
            default:
                Assert.fail("El texto de botón no forma parte de las opciones a validar");
        }

    }

    @And("Ingreso {string} en el campo {string}")
    public void ingresoEnElCampo(String arg0, String arg1) {
        sauceDemoCheckoutOnePage.typeInputs(arg0,arg1);
    }
}
