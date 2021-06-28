package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.Car_Grid_Page;
import pages.HomePage;
import pages.VyTrackLoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginVyTrack {
    @Test
    public void login_page() {
/**  Given: I am on Vytrack login page
     When : I log in with valid username and password
       And: I am redirected to home page
      When: I hover over Fleet and see Vehicles button
       And: I click Vehicles button
       And: I am redirected to Car Grid page
      When: I see an Export Grid button and click it
      Then: I should be able to click it and see dropdowns "CSV" AND "XLSX"
 */
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        BrowserUtils.sleep(2);
        VyTrackLoginPage login = new VyTrackLoginPage();
        Car_Grid_Page car_grid = new Car_Grid_Page();
        HomePage homePage = new HomePage();

        login.inputEmail.sendKeys(ConfigurationReader.getProperty("userName1"));
        login.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        login.loginBtn.click();
        BrowserUtils.sleep(2);

        homePage.fleetBtn.click();
        BrowserUtils.sleep(2);
        homePage.vehicle.click();

        car_grid.exportGridBtn.click();
        car_grid.exportGridBtn.getText();

        Assert.assertTrue( car_grid.exportGridBtn.isEnabled());
        Assert.assertTrue( car_grid.exportGridBtn.isDisplayed());

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

}

