package Pages;

import Utility.CommonUtil;
import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetailsPage extends BaseUtil {

    @FindBy(xpath="//*[@id='title']")
    private WebElement title;
    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastName;
    @FindBy(xpath = "//*[@id='dob']")
    private WebElement dateOfBirth;
    @FindBy(xpath = "//*[@id='ssn']")
    private WebElement socialSecurityNo;
    @FindBy(xpath = "//*[@id='emailAddress']")
    private WebElement email;
    @FindBy(xpath = "//*[@id='password']")
    private WebElement Passwd;
    @FindBy(xpath = "//*[@id='confirmPassword']")
    private WebElement confirmPassword;
    @FindBy(xpath="/html/body/div[1]/div/div/div[2]/form")
    private WebElement userDetailsForm;
    @FindBy(xpath=" /html/body/div[1]/div/div/div[2]/form/button")
    private WebElement nextBtn;



    public UserDetailsPage(){
        PageFactory.initElements(driver,this);
    }


    public void fillUserDetails(String t, String firstname, String lastname,String Gender,
                                  String dateofBirth, String socialSecurityno, String Email, String Password,String confirmpassword)
    {
        CommonUtil.waitUntilElementIsDisplayed( userDetailsForm, 10);
        selectTitle(t);
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        selectGender(Gender);
        dateOfBirth.sendKeys(dateofBirth);
        socialSecurityNo.sendKeys(socialSecurityno);
        email.sendKeys(Email);
        Passwd.sendKeys(Password);
        confirmPassword.sendKeys(confirmpassword);

    }

    public void selectTitle(String type) {
        CommonUtil.selectDropDownByVisibleText(title,type);
    }
    public void selectGender(String type) {
        CommonUtil.selectRadioButton(driver.findElement(By.xpath("//input[@type= 'radio' and @value='M']")));
    }

    public void clickOnNextBtn()
    {
        if(nextBtn.isDisplayed())
        {
            nextBtn.click();
        }CommonUtil.waitUntilElementIsDisplayed(nextBtn,5);
    }


}
