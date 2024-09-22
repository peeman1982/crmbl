package pages.footer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Page;

public class CrmblFooter extends Page {


    @FindBy(xpath = "//p[@class='font-normal text-[16px] leading-[20px] 2xl:text-[18px] 2xl:leading-[22px]'][text()='Order']")
    private WebElement orderButton;

    @FindBy(xpath = "//p[text()='Our story']")
    private WebElement ourStoryButton;

    @FindBy(xpath = "//p[text()='Rewards']")
    private WebElement rewardsButton;

    @FindBy(xpath = "//p[text()='Nutrition & Allergy']")
    private WebElement nutritionAndAllergyButton;

    @FindBy(xpath = "//p[text()='Support']")
    private WebElement supportButton;

    @FindBy(xpath = "//p[text()='Media Kit']")
    private WebElement mediaKitButton;

    @FindBy(xpath = "//p[text()='Collaborate']")
    private WebElement collaborateButton;

    @FindBy(xpath = "//p[text()='Franchising']")
    private WebElement franchisingButton;

    @FindBy(xpath = "//p[text()='Franchise Store Jobs']")
    private WebElement franchiseStoreJobsButton;

    @FindBy(xpath = "//p[text()='HQ Careers']")
    private WebElement hqCareersButton;

    @FindBy(xpath = "//p[text()='Crumbl Cares']")
    private WebElement crumblCaresButton;


    //social media icons
    @FindBy(xpath = "//div[@class='flex flex-row flex-wrap w-full items-center justify-center gap-x-4 sm:gap-x-[30px]']//a[contains(@href, 'facebook')]")
    private WebElement facebookIcon;

    @FindBy(xpath = "//div[@class='flex flex-row flex-wrap w-full items-center justify-center gap-x-4 sm:gap-x-[30px]']//a[contains(@href, 'instagram')]")
    private WebElement instagramIcon;

    @FindBy(xpath = "//div[@class='flex flex-row flex-wrap w-full items-center justify-center gap-x-4 sm:gap-x-[30px]']//a[contains(@href, 'tiktok')]")
    private WebElement tiktokIcon;

    @FindBy(xpath = "//div[@class='flex flex-row flex-wrap w-full items-center justify-center gap-x-4 sm:gap-x-[30px]']//a[contains(@href, 'x.com')]")
    private WebElement xIcon;

    @FindBy(xpath = "//div[@class='flex flex-row flex-wrap w-full items-center justify-center gap-x-4 sm:gap-x-[30px]']//a[contains(@href, 'youtube')]")
    private WebElement youtubeIcon;

    @FindBy(xpath = "//div[@class='flex flex-row flex-wrap w-full items-center justify-center gap-x-4 sm:gap-x-[30px]']//a[contains(@href, 'linkedin')]")
    private WebElement linkedinIcon;

    @FindBy(xpath = "//div[@class='flex flex-row flex-wrap w-full items-center justify-center gap-x-4 sm:gap-x-[30px]']//a[contains(@href, 'pinterest')]")
    private WebElement pinterestIcon;

    @FindBy(xpath = "//a[text()='Privacy policy']")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//a[text()='Terms and Conditions']")
    private WebElement termsAndConditionsLink;

    @FindBy(xpath = "//button[contains(text(),'Non-edible Cookie Preferences')]")
    private WebElement nonEdibleCookiePreferencesLink;








    public void clickOnOrderFromFooter() {
        orderButton.click();
    }
    public void clickOnOurStory() {ourStoryButton.click();}
    public void clickOnRewards() {
        rewardsButton.click();
    }
    public void clickOnNutrition() {nutritionAndAllergyButton.click();}
    public void clickOnSupport() {
        supportButton.click();
    }
    public void clickOnMediaKit() {
        mediaKitButton.click();
    }
    public void clickOnCollaborate() {
        collaborateButton.click();
    }
    public void clickOnFranchising() {
        franchisingButton.click();
    }
    public void clickOnFranchiseStoreJob() {
        franchiseStoreJobsButton.click();
    }
    public void clickOnHQCareers() {
        hqCareersButton.click();
    }
    public void clickOnCrumblCares() {
        crumblCaresButton.click();
    }
    public void clickOnFacebook() {
        facebookIcon.click();
    }
    public void clickOnInstagram() {instagramIcon.click();}
    public void clickOnTikTok() {tiktokIcon.click();}
    public void clickOnX() {
        xIcon.click();
    }
    public void clickOnYoutube() {
        youtubeIcon.click();
    }
    public void clickOnLinkedin() {
        linkedinIcon.click();
    }
    public void clickOnPinterest() {
        pinterestIcon.click();
    }


}
