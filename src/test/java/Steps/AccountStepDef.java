package Steps;


import Base.BaseUtil;
import Pages.*;
import Utility.CommonUtil;
import Utility.LoggerHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;
public class AccountStepDef extends BaseUtil {
    Logger log = LoggerHelper.getLogger(Steps.LoginStepDef.class);
    AccountPage accountPage = new AccountPage();
    HomePage home = new HomePage();
    TransactionPage transactionPage = new TransactionPage();
    AddressDetailsPage addressDetails = new AddressDetailsPage();
    private int initialCount = home.verifyInitialNotificationCount();


    @When("^expand checking under Banking Accounts$")
    public void expand_checking_under_Banking_Accounts() {
        home.clickOnBankAccount();
    }

    @When("^click on new Checking$")
    public void click_on_new_Checking() {
        home.createANewAccount();

    }

    @Then("^should be able to create a new Account with following details$")
    public void should_be_able_to_create_a_new_Account_with_following_details(DataTable table) {
        List<Account> accountDetails;
        accountDetails = table.asList(Account.class);
        for (Account A : accountDetails) {
            new AccountPage().fillAccountDetails(A.accountType, A.accountOwner, A.accountName, A.deposite);
            final int initialDeopsite = A.deposite;
            final String owner = A.accountName;
            CommonUtil.performScrolldownToBottom();
            new AccountPage().submit();
        }
    }

    @When("^should be able to verify the created Account by increased notification Count$")
    public void should_be_able_to_verify_the_created_Account_by_increased_notification_Count() {
        int afterCount = home.verifyAfterlNotificationCount();
        if (!(afterCount > initialCount)) {
            Assert.fail("Account has not created");
        }

    }



    public class Account{
        public String accountType;
        public String accountOwner;
        public String accountName;
        public int deposite;


       Account(String accountType,String accountOwner,String accountName,int deposite){
            this.accountType=accountType;
            this.accountOwner=accountOwner;
            this.accountName=accountName;
            this.deposite=deposite;
        }
    }
}

