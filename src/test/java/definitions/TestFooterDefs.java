package definitions;

import io.cucumber.java.en.When;
import pages.footer.CrmblFooter;


public class TestFooterDefs {
    CrmblFooter crumblFooter = new CrmblFooter();

    @When("I click on Order")
    public void iClickOnOrder() {
        crumblFooter.clickOnOrderFromFooter();
    }

    @When("I click on Our story")
    public void iClickOnOurStory() {
        crumblFooter.clickOnOurStory();
    }

    @When("I click on Rewards")
    public void iClickOnRewards() {
        crumblFooter.clickOnRewards();
    }
}
