package pages;

import org.openqa.selenium.support.PageFactory;

import static support.DriverFactory.getDriver;

public class Page {
    //fields
    protected String title;
    protected String  url;


    //constructor
    public Page() {
        PageFactory.initElements(getDriver(), this);
    }
    //methods
    public void open() {
        getDriver().get(url);
    }

    public String getTitle() {
        return title;
    }
}
