package Steps;
import Base.BaseUtil;
import Pages.LoginPage;
import Pages.HomePage;
import Pages.TransactionPage;
import Utility.LoggerHelper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;

public class TransactionStepDef extends BaseUtil {
    Logger log = LoggerHelper.getLogger(LoginStepDef.class);
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    TransactionPage transactionPage = new TransactionPage();

    @When("^expand checking under Transaction Accounts$")
    public void expand_checking_under_Transaction_Accounts()
    {
        homePage.clickOntransaction();
    }


    @When("^click on deposite$")
    public void click_on_deposite() {
        homePage.clickOnDeposite();
    }

    @Then("^deposite form should open$")
    public void deposite_form_should_open() {
        transactionPage.verifyTransactionPage();

    }

    @Then("^User should be able to select account  to do (\\d+) following$")
    public void user_should_be_able_to_select_account_to_do_following(int amount) {
        transactionPage.depositeAmount(amount);
    }

    @When("^click on withdraw$")
    public void click_on_withdraw() {

        homePage.clickOnWitdraw();
    }

    @Then("^Withdraw form should open$")
    public void withdraw_form_should_open() {
        transactionPage.verifyTransactionPage();
    }

    @Then("^User should be able to select account  to  do (\\d+)$")
    public void user_should_be_able_to_select_account_to_do(int amount) {
        transactionPage.withdrawAmount(amount);
    }
}
