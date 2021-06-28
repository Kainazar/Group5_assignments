package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VyTrackLoginPage {

    public VyTrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "prependedInput")
    public WebElement inputEmail;

    @FindBy (id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy (id = "_submit")
    public WebElement loginBtn;





}