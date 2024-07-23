package pages.SauceDemoPages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePages;

import java.util.List;

public class SauceDemoCartPage extends BasePages {
    @FindBy(xpath = "//span[@data-test='title']")
    private WebElement titlePage;
    @FindBy(xpath = "//div[@data-test='inventory-item']")
    private List<WebElement> itemsInCart;
    @FindBy(xpath = "//button[@data-test='checkout']")
    private WebElement buttonCheckout;
    public void validateTitlePage(String txt){
        Assert.assertTrue("Titulo: " +txt+ " No disponible",esperarElemento(titlePage,10));
        validateElementText(titlePage,txt);
    }

    public void validateItemsInCart(int qty){
        Assert.assertTrue("Campo username No disponible", esperarElementos(itemsInCart, 10));
        if (qty != itemsInCart.size()){
            Assert.fail("La cantidad de items no coincide.\n" +
                    "Cantidad esperada: "+ qty+"\n"+
                    "Cantidad obtenida: "+ itemsInCart.size());
        }
        System.out.println("Cantidad esperada: "+ qty+"\n"+
                "Cantidad obtenida: "+ itemsInCart.size());
    }

    public void botonCheckout(boolean click) {
        if (click) {
            Assert.assertTrue("Botón checkout No disponible",esperarElemento(buttonCheckout,10));
            click(buttonCheckout);
        } else {
            Assert.assertTrue("Botón checkout No disponible",esperarElemento(buttonCheckout,10));
        }
    }
}
