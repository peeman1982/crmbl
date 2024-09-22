package pages.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;

import java.time.Duration;

import static support.DriverFactory.getDriver;

public class CrmblHomePage extends Page {

    public CrmblHomePage() {
        title = "Crumbl Cookies - Freshly Baked & Delivered Cookies";
        url = "https://crumblcookies.com/";
    }

    @FindBy(xpath = "//span[text()='Accept All Cookies']")
    private WebElement acceptCookieButton;
    @FindBy(xpath = "//p[contains(text(), 'Menu')]")
    private WebElement menuButton;

    @FindBy(xpath = "//p[text()='Home']")
    private WebElement modalHomeButton;

    @FindBy(xpath = "(//a[text() = 'Order Now'])[1]")
    private WebElement orderNowButton;




    public void acceptCookie() {
        try {
            new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions
                    .elementToBeClickable(acceptCookieButton));
        } catch (Exception e) {
            System.out.println("Cookie consent button not found or clickable: " + e.getMessage());
        }
        acceptCookieButton.click();
    }

    public void clickOnMenu() {
        menuButton.click();
    }
        public void clickOnModalHome(){
            modalHomeButton.click();
    }
    public void clickOrderNowButton(){
        orderNowButton.click();
    }

}
