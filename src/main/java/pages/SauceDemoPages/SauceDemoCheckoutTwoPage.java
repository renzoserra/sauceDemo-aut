package pages.SauceDemoPages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePages;

public class SauceDemoCheckoutTwoPage extends BasePages {

    @FindBy(xpath = "//span[@data-test='title']")
    private WebElement titlePage;
    @FindBy(xpath = "//button[@data-test='finish']")
    private WebElement buttonFinish;

    public void validateTitlePage(String txt){
        Assert.assertTrue("Titulo: " +txt+ " No disponible",esperarElemento(titlePage,10));
        validateElementText(titlePage,txt);
    }
    public void botonFinish(boolean click) {
        if (click) {
            Assert.assertTrue("Botón Finish No disponible",esperarElemento(buttonFinish,10));
            click(buttonFinish);
        } else {
            Assert.assertTrue("Botón Finish No disponible",esperarElemento(buttonFinish,10));
        }
    }
}
