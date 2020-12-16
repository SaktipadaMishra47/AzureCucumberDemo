package Pages;

import Base.BaseUtil;
import Utility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends BaseUtil {
    @FindBy(name = "username")
    private WebElement userNameTxt;
    @FindBy(name = "password")
    private WebElement passWordTxt;
    @FindBy(id = "submit")
    private WebElement loginBtn;
    @FindBy(name = "remember-me")
    private WebElement checkBox;
    @FindBy(xpath="//a[contains(@href,'signup')]")
    private WebElement signUp;

    public LoginPage () {

        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {
        CommonUtil.waitUntilElementIsDisplayed(userNameTxt, 5);
        userNameTxt.clear();
        userNameTxt.sendKeys(username);
        passWordTxt.sendKeys(password);
    }

    public void loginBtn()
    {
        loginBtn.click();
    }
    public void signUp()
    {
        signUp.click();
    }

    public void verifySuccessfulLogout()
    {
        if(CommonUtil.verifyPageContainsText("Logout completed")){
            System.out.println("Logout successful");
            CommonUtil.dismissAlert();
                    }
    }

}
