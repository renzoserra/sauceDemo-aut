package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.SauceDemoPages.*;
import steps.Hooks;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();
    protected SauceDemoHomePage sauceDemoHomePage =  PageFactory.initElements(driver, SauceDemoHomePage.class);
    protected SauceDemoInventoryPage sauceDemoInventoryPage = PageFactory.initElements(driver, SauceDemoInventoryPage.class);
    protected SauceDemoCartPage sauceDemoCartPage = PageFactory.initElements(driver, SauceDemoCartPage.class);
    protected SauceDemoCheckoutOnePage sauceDemoCheckoutOnePage = PageFactory.initElements(driver, SauceDemoCheckoutOnePage.class);
    protected SauceDemoCheckoutTwoPage sauceDemoCheckoutTwoPage = PageFactory.initElements(driver, SauceDemoCheckoutTwoPage.class);
    protected SauceDemoCheckoutCompletePage sauceDemoCheckoutCompletePage = PageFactory.initElements(driver, SauceDemoCheckoutCompletePage.class);



}
