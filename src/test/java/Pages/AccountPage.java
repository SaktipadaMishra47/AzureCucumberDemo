package Pages;
import Base.BaseUtil;
import Utility.CommonUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AccountPage extends  BaseUtil {


    @FindBy(xpath="//*[@id='name']")
    private WebElement accountName;
    @FindBy(xpath="//*[@id='openingBalance']")
    private WebElement Deposite;
    @FindBy(xpath="//button[@type='submit' and @class='btn btn-primary btn-sm']")
    private WebElement submitBtn;
    @FindBy(xpath="//*[@id='right-panel']/div[2]/div/div/div/div/form/div[1]/div[2]/div[2]/label[1]")
    private WebElement accountType;
    @FindBy(xpath="//*[@id='Joint']")
    private WebElement accountOwner;


    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectAccType(String AccT){
        CommonUtil.selectRadioButtonByName(AccT);
    }
    public void selectOwnership(String AccO){
        CommonUtil.selectRadioButtonByName(AccO);
    }
    public void submit(){
        submitBtn.click();
    }


    public void fillAccountDetails(String accountType,
                                   String accountOwner,
                                   String accountNm,
                                   int deposite)
    {
        selectAccType(accountType);
        selectOwnership(accountOwner);
        accountName.sendKeys(accountNm);
        Deposite.sendKeys(String.valueOf(deposite));


    }
}
