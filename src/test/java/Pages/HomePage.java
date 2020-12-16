package Pages;

import Base.BaseUtil;
import Utility.CommonUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BaseUtil {
    @FindBy(xpath = "//*[@class='no-js']")
    private WebElement Home;
    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/div[1]/a/img")
    private WebElement profileLogo;
    @FindBy(xpath = "//a[contains(@href,'logout')]")
    private WebElement logout;
    //Acc checking new
    @FindBy(xpath = "//*[@id='main-menu']/ul/li[2]/a")
    private WebElement accOptions;
    @FindBy(xpath = "//canvas[@id='depositVsWithdraw']")
    private WebElement mouseHoverElement;
    @FindBy(xpath = "//*[@id='notification']/span")
    private WebElement count;
    @FindBy(xpath = "//*[@id='main-menu']/ul/li[2]/ul/li[2]/a")
    private WebElement createAccBtn;
    // transaction Account
    @FindBy(xpath = "//i[@class='menu-icon fa fa-book']")
    private WebElement transactionExpand;
    @FindBy(xpath = "//a[contains(@href ,'/account/withdraw')]")
    private WebElement withdrawBtn;
    @FindBy(xpath = "//a[contains(@href,'/account/deposit')]")
    private WebElement depositBtn;




    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnLogo() {
        if (profileLogo.isDisplayed()) {
            profileLogo.click();
        }
        CommonUtil.waitUntilElementIsDisplayed(profileLogo, 5);
    }

    public void logoOut() {
        if (logout.isDisplayed()) {
            logout.click();
        } else {
            CommonUtil.waitUntilElementIsDisplayed(logout, 5);
        }
    }

    public void clickOnBankAccount() {
        CommonUtil.clickOnElement(accOptions);
    }

    public void createANewAccount() {
        createAccBtn.click();
    }

    public int verifyInitialNotificationCount() {
        int beforeCount = Integer.parseInt(count.getText());
        return beforeCount;
    }

    public int verifyAfterlNotificationCount() {
        int afterCount = Integer.parseInt(count.getText());
        return afterCount;
    }

    public void clickOntransaction()
    {
        CommonUtil.waitUntilElementIsDisplayed(transactionExpand,10);
        transactionExpand.click();
    }
    public void clickOnWitdraw(){
        withdrawBtn.click();
    }
    public void clickOnDeposite(){
        depositBtn.click();
    }
}


