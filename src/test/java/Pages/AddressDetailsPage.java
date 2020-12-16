package Pages;

import Utility.CommonUtil;
import org.openqa.selenium.By;
import Base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AddressDetailsPage extends BaseUtil{

    public AddressDetailsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='address']")
    private WebElement address;
    @FindBy(xpath = "//*[@id='locality']")
    private WebElement locality;
    @FindBy(xpath = "//*[@id='region']")
    private WebElement region;
    @FindBy(xpath = "//*[@id='country']")
    private WebElement country;
    @FindBy(xpath = "//*[@id='postalCode']")
    private WebElement postalcode;
    @FindBy(xpath = "//*[@id='homePhone']")
    private WebElement homePhone;
    @FindBy(xpath = "//*[@id='workPhone']")
    private WebElement workPhone;
    @FindBy(xpath = "//*[@id='mobilePhone']")
    private WebElement mobileNumber;
    @FindBy(xpath = "//*[@id='agree-terms']")
    private WebElement checkBox;
    @FindBy(xpath="/html/body/div[1]/div/div/div[2]/form/button")
    private WebElement registerBtn;
    @FindBy(xpath="/html/body/div[1]/div/div")
    private WebElement addressForm;

    public void fillAddressDetails(String Address, String Locality, String Region,
                                   String Country, long Postalcode, long Homephone, long Workphone,long Mobilenumber) {
        CommonUtil.waitUntilElementIsDisplayed( addressForm, 10);
        address.sendKeys(Address);
        locality.sendKeys(Locality);
        region.sendKeys(Region);
        country.sendKeys(Country);
        postalcode.sendKeys(String.valueOf(Postalcode));
        homePhone.sendKeys(String.valueOf(Homephone));
        workPhone.sendKeys(String.valueOf(Workphone));
        mobileNumber.sendKeys(String.valueOf(Mobilenumber));


    }

    public void selectCheckBox()
    {
      checkBox.click();
    }

    public void register()
    {
        if(registerBtn.isDisplayed()){
            registerBtn.click();
        }
        CommonUtil.waitUntilElementIsClickable(registerBtn,5);
    }

}
