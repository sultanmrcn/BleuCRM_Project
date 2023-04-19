package com.cydeo.step_definitions;

import com.cydeo.pages.BleuCRMLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    BleuCRMLoginPage bleuCRMLoginPage = new BleuCRMLoginPage();
    @Given("user is on login page of Bleu CRM")
    public void user_is_on_login_page_of_bleu_crm() {
        String url = ConfigurationReader.getProperty("bleuCrm.url");
        Driver.getDriver().get(url);
    }
    @When("user enters username {string}")
    public void user_enters_username(String userName) {
        bleuCRMLoginPage.usernameInput.sendKeys(userName);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        bleuCRMLoginPage.passwordInput.sendKeys(password);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        bleuCRMLoginPage.loginButton.click();
    }

    @Then("user sees profile name contains user's title {string}")
    public void user_sees_profile_name_contains_user_s_title(String profileTitle) {
        bleuCRMLoginPage.userProfileName.getText().contains(profileTitle);
        Assert.assertTrue( bleuCRMLoginPage.userProfileName.getText().contains(profileTitle));
    }
//    @Then("user sees profile name contains {string}")
//    public void user_sees_profile_name_contains(String profileTitle) {
//        bleuCRMLoginPage.userProfileName.getText().contains(profileTitle);
//        Assert.assertTrue( bleuCRMLoginPage.userProfileName.getText().contains(profileTitle));
//
//    }


////    @Then("user clicks to log out button")
////    public void userClicksToLogOutButton() {
////        bleuCRMLoginPage.ProfileAvatar.click();
////        bleuCRMLoginPage.LogOutButton.click();
//////        bleuCRMLoginPage.usernameInput.clear();
//       Driver.closeDriver();
//    }


}
