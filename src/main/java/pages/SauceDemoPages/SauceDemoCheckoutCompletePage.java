package pages.SauceDemoPages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePages;

public class SauceDemoCheckoutCompletePage extends BasePages {

    @FindBy(xpath = "//span[@data-test='title']")
    private WebElement titlePage;
    @FindBy(xpath = "//h2[@data-test='complete-header']")
    private WebElement headerThanks;

    public void validateText(String txt){
        switch (txt){
            case "Checkout: Complete!":
                Assert.assertTrue("Titulo: " +txt+ " No disponible",esperarElemento(titlePage,10));
                validateElementText(titlePage,txt);
                break;
            case "Thank you for your order!":
                Assert.assertTrue("Titulo: " +txt+ " No disponible",esperarElemento(headerThanks,10));
                validateElementText(headerThanks,txt);
                break;
            default:
                Assert.fail("El texto no forma parte de las opciones a validar");
        }

    }

}
