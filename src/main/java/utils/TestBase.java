package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.SauceDemoPages.SauceDemoHomePage;
import steps.Hooks;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();
    protected SauceDemoHomePage sauceDemoHomePage =  PageFactory.initElements(driver, SauceDemoHomePage.class);

}
