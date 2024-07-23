package pages.SauceDemoPages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePages;

public class SauceDemoHomePage extends BasePages {

    @FindBy(xpath = "//input[@data-test='username']")
    private WebElement usernameInput;
    @FindBy(xpath = "//input[@data-test='password']")
    private WebElement passwordInput;
    @FindBy(xpath = "//input[@data-test='login-button']")
    private WebElement loginButton;

    public void goToUrlSauceDemo(String url){
        goToUrl(url);
    }

    public void typeCredentials(String username, String pass){
        Assert.assertTrue("Campo username No disponible",esperarElemento(usernameInput,10));
        Assert.assertTrue("Campo password No disponible",esperarElemento(passwordInput,10));
        typeInput(usernameInput,username);
        typeInput(passwordInput,pass);
    }

    public void botonLogin(boolean click) {
        if (click) {
            Assert.assertTrue("Campo botón login No disponible",esperarElemento(loginButton,10));
            click(loginButton);
        } else {
            Assert.assertTrue("Campo botón login No disponible",esperarElemento(loginButton,10));
        }
    }


}
