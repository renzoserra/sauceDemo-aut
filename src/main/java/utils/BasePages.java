package utils;

import org.openqa.selenium.WebDriver;
import steps.Hooks;

public class BasePages {

    static WebDriver driver;
    public BasePages() {
        driver = Hooks.getDriver();
    }

    public static void goToUrl(String url) {
        try {
            System.out.println("Estamos dirigiéndonos a la URL: " + url);
            driver.get(url);
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar navegar a la URL: " + url);
            e.printStackTrace();
        }
    }
}
