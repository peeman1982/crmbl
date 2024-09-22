package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.home.CrmblHome;
import pages.home.OrderPage;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static support.DriverFactory.getDriver;

public class TestHomePageDefs {
    CrmblHome crumblHomePage = new CrmblHome();
    OrderPage orderPage = new OrderPage();

    @Given("I open the home page")
    public void iOpenTheHomePage() {
        crumblHomePage.open();

    }

    @When("I click on Menu")
    public void iClickOnMenu() {
        crumblHomePage.clickOnMenu();
    }

    @Then("I verify Menu modal opens")
    public void iVerifyMenuModalOpens() {
        new WebDriverWait(getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Home']")));
    }

    @And("I accept cookies")
    public void iAcceptCookies() {
        crumblHomePage.acceptCookie();
    }

    @When("I click on Order Now")
    public void iClickOnOrderNow() {
        crumblHomePage.clickOrderNowButton();
    }

    @Then("I verify Order page opens")
    public void iVerifyOrderPageOpens() {
        String expectedUrl = "https://crumblcookies.com/order";
        String currentUrl = getDriver().getCurrentUrl();
        assertEquals(expectedUrl, currentUrl);
    }
}
