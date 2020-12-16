package Pages;
import Base.BaseUtil;
import Utility.CommonUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionPage extends BaseUtil {
    @FindBy(xpath="//div[@class='card-header bg-flat-color-1']")
    private WebElement Form;

    //Form webelements for withdraw
    @FindBy(xpath="//select[@class='form-control']")
    private WebElement dropDown;
    @FindBy(xpath="//input[@type='text' and @class='form-control']")
    private WebElement amountBox;
    @FindBy(xpath="//button[@type='submit' and @class='btn btn-primary btn-sm']")
    private WebElement submit;

    public TransactionPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyTransactionPage()
    {
        Form.click();
    }

    public void depositeAmount(int amount){
        CommonUtil.selectDropDownByIndex(dropDown,1);
        amountBox.sendKeys(String.valueOf(amount));
        submit.click();
    }
    public void withdrawAmount(int amount){
        CommonUtil.selectDropDownByIndex(dropDown,1);
        amountBox.sendKeys(String.valueOf(amount));
        submit.click();
    }


}
