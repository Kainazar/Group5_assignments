package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Car_Grid_Page {
    public Car_Grid_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@class='pull-left grid-toolbar-mass-actions']")
    public WebElement exportGridBtn;
}
