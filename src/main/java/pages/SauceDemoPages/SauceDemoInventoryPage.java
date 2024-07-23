package pages.SauceDemoPages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePages;

import java.util.List;
import java.util.Random;

public class SauceDemoInventoryPage extends BasePages {

    @FindBy(xpath = "//span[@data-test='title']")
    private WebElement titlePage;
    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory ']")
    private List<WebElement> buttonsAddToCart;
    @FindBy(xpath = "//a[@data-test='shopping-cart-link']")
    private WebElement buttonCart;

    public void validateTitlePage(String txt){
        Assert.assertTrue("Titulo: " +txt+ " No disponible",esperarElemento(titlePage,10));
        validateElementText(titlePage,txt);
    }

    public void addItemsToCart(int qty) {
        Assert.assertTrue("Campo username No disponible", esperarElementos(buttonsAddToCart, 10));

        Random random = new Random();
        int addedItems = 0;

        while (addedItems < qty && !buttonsAddToCart.isEmpty()) {
            int index = random.nextInt(buttonsAddToCart.size());
            WebElement button = buttonsAddToCart.get(index);
            try {
                button.click();
                addedItems++;
                buttonsAddToCart.remove(index);
                System.out.println("Artículo añadido al carrito. Total añadidos: " + addedItems);
            } catch (Exception e) {
                System.out.println("Error al intentar añadir el artículo al carrito: " + e.getMessage());
            }
        }
        if (addedItems < qty) {
            System.out.println("No se pudieron añadir todos los artículos solicitados. Total añadidos: " + addedItems);
        }
    }
    public void botonLogin(boolean click) {
        if (click) {
            Assert.assertTrue("Campo botón carrito No disponible",esperarElemento(buttonCart,10));
            click(buttonCart);
        } else {
            Assert.assertTrue("Campo botón carrito No disponible",esperarElemento(buttonCart,10));
        }
    }

}
