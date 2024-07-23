package pages.SauceDemoPages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePages;

public class SauceDemoCheckoutOnePage extends BasePages {
    @FindBy(xpath = "//span[@data-test='title']")
    private WebElement titlePage;
    @FindBy(xpath = "//input[@data-test='continue']")
    private WebElement buttonContinue;
    @FindBy(xpath = "//input[@data-test='firstName']")
    private WebElement inputFirstname;
    @FindBy(xpath = "//input[@data-test='lastName']")
    private WebElement inputLastname;
    @FindBy(xpath = "//input[@data-test='postalCode']")
    private WebElement inputZipCode;

    public void validateTitlePage(String txt){
        Assert.assertTrue("Titulo: " +txt+ " No disponible",esperarElemento(titlePage,10));
        validateElementText(titlePage,txt);
    }
    public void botonContinue(boolean click) {
        if (click) {
            Assert.assertTrue("Botón Continue No disponible",esperarElemento(buttonContinue,10));
            click(buttonContinue);
        } else {
            Assert.assertTrue("Botón Continue No disponible",esperarElemento(buttonContinue,10));
        }
    }
    public void typeInputs(String txt, String field){
        switch (field){
            case "First Name":
                Assert.assertTrue("Campo First Name No disponible",esperarElemento(inputFirstname,10));
                typeInput(inputFirstname,txt);
                break;
            case "Last Name":
                Assert.assertTrue("Campo First Name No disponible",esperarElemento(inputLastname,10));
                typeInput(inputLastname,txt);
                break;
            case "Zip/Postal Code":
                Assert.assertTrue("Campo First Name No disponible",esperarElemento(inputZipCode,10));
                typeInput(inputZipCode,txt);
                break;
            default:
                Assert.fail("El campo no forma parte de las opciones a validar");
        }
    }
}
