package utils;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Hooks;

import java.time.Duration;
import java.util.List;

public class BasePages {

    private static WebDriver driver;
    private static WebDriverWait wait;
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
    public static boolean esperarElemento(WebElement elemento, int tiempoMaximoSegundos) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(tiempoMaximoSegundos));
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(elemento));
            System.out.println("El elemento se encuentra disponible");
            Assert.assertNotNull("El elemento esperado no es nulo", element);
        } catch (Exception e) {
            Assert.fail("Ocurrió un error, no se encuentra el elemento disponible: " + e.getMessage());
            return false;
        }
        return true;
    }
    public static void typeInput(WebElement element, String txtType) {
        try {
            element.sendKeys(txtType);
            System.out.println("Se escribe correctamente el texto: " + txtType);
        } catch (Exception e) {
            Assert.fail("Ocurrió un error, no se encuentra el elemento disponible: " + e.getMessage());
        }
    }
    public static void click(WebElement element) {
        try {
            element.click();
            System.out.println("Se hizo click correctamente en el elemento");
        } catch (Exception e) {
            Assert.fail("Ocurrió un error, no se encuentra el elemento disponible: " + e.getMessage());
        }
    }
    public static void validateElementText(WebElement element, String txt) {
        try {
            String actualText = element.getText();
            System.out.println("Validando texto del elemento:\n" +
                    "Texto obtenido: " + actualText + "\n" +
                    "Texto esperado: " + txt);
            Assert.assertEquals("El texto del elemento no coincide con lo esperado.\n" +
                            "Texto obtenido: " + actualText + "\n" +
                            "Texto esperado: " + txt,
                    txt, actualText);
        } catch (Exception e) {
            System.out.println("Ocurrió un error, no se encuentra el elemento disponible: " + e.getMessage());
            Assert.fail("Ocurrió un error, no se encuentra el elemento disponible: " + e.getMessage());
        }
    }
    public static void validateUrl(String txtURL) {
        try {
            String urlCurrent = driver.getCurrentUrl();
            System.out.println("Validando URL:\n" +
                    "URL actual: " + urlCurrent + "\n" +
                    "Texto esperado: " + txtURL);
            Assert.assertTrue("La URL actual no contiene el texto esperado:\n" +
                            "URL actual: " + urlCurrent + "\n" +
                            "Texto esperado: " + txtURL,
                    urlCurrent.contains(txtURL));
        } catch (Exception e) {
            System.out.println("Ocurrió un error al validar la URL.");
            e.printStackTrace();
        }
    }

    public boolean esperarElementos(List<WebElement> elementos, int tiempoMaximoSegundos) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(tiempoMaximoSegundos));
        try {
            List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElements(elementos));
            System.out.println("Los elementos se encuentran disponibles");
            Assert.assertNotNull("Los elementos esperados no son nulos", elements);
        } catch (Exception e) {
            Assert.fail("Ocurrió un error, no se encuentran los elementos disponibles: " + e.getMessage());
            return false;
        }
        return true;
    }
}

