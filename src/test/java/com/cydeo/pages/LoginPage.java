package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BleuCRM_All_Users_LoginPage {
    public BleuCRM_All_Users_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public static WebElement usernameInput;
    @FindBy(xpath = "//input[@type='password']")
    public static WebElement passwordInput;

//    @FindBy(css = "input[name='USER_PASSWORD']")
//    public WebElement inputUserPassword;
    @FindBy(xpath = "//input[@type='submit']")
    public static WebElement loginButton;

    @FindBy(xpath = "//span[@id='user-name']")
    public static WebElement userProfileName;

    @FindBy(xpath = "//span[@class= 'user-img user-default-avatar']")
    public static WebElement ProfileAvatar;

    @FindBy(linkText = "Log out")
    public static WebElement LogOutButton;

    @FindBy(xpath = "//div[@class='errortext']")
    public static WebElement ErrorText;

    @FindBy(css = "input[name='USER_PASSWORD']")
    public static WebElement inputUserPassword;

    @FindBy(xpath = "//label[@for='USER_REMEMBER']")
    public static WebElement  RememberMeLink;

    @FindBy(xpath = "//input[@id='USER_REMEMBER']")
    public static WebElement  RememberMeCheckbox;

    @FindBy(xpath = "//a[@href='/?forgot_password=yes']")
    public static WebElement ForgotPassLink;

    public static void login(String userName, String password) {
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();

    }
    public static void VerifyLoginErrorMsg(){
        String expectedErrorMes = "Incorrect login or password";
        String actualErrorMes = ErrorText.getText();
        Assert.assertEquals(actualErrorMes,expectedErrorMes);

    }



}
