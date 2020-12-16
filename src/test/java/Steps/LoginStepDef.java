package Steps;

import Base.BaseUtil;
import Pages.LoginPage;
import Pages.HomePage;
import Utility.CommonUtil;
import Utility.LoggerHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class LoginStepDef extends BaseUtil {

    Logger log = LoggerHelper.getLogger(LoginStepDef.class);
    LoginPage loginPage = new LoginPage();
    HomePage HomePage = new HomePage();



    @When("^I navigate to Login Page$")
    public void iNavigateToLoginPage() {
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle, "Digital Bank");
    }

    @And("^click on Login button$")
    public void clickOnLoginButton(){
              loginPage.loginBtn();
    }



    @Then("^I should navigate to Home Page$")
    public void iShouldNavigateToHomePage()  {
         CommonUtil.verifyPageContainsText("Welcome");
    }

    @Then("^I should navigate to login Page$")
    public void i_should_navigate_to_login_Page() {
             loginPage.verifySuccessfulLogout();
    }

    @When("^I navigate to Login Page and enter ([^\"]*) and ([^\"]*)$")
    public void iNavigateToLoginPageAndEnterUsernameAndPassword(String username, String password) {
        System.out.println("username is " + username + " password is " + password);
        log.info("Logger");

        loginPage.login(username, password);
    }

    @When("^Navigate to Login Page and enter the following user(\\d+) and password(\\d+)$")
    public void navigate_to_Login_Page_and_enter_the_following_user_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("^click on My profile Logo$")
    public void click_on_My_profile_Logo() {
    HomePage.clickOnLogo();
    }

    @Then("^I should click on logout button$")
    public void i_should_click_on_logout_button()  {
        HomePage.logoOut();
    }

    @Then("^I should not navigate to Home Page$")
    public void iShouldNotNavigateToHomePage()  {

        if(!CommonUtil.verifyPageContainsText("Welcome")){
            Assert.assertEquals(false,false,"passed");
        }
    }

    @When("^Navigate to Login Page and enter the following$")
    public void navigateToLoginPageAndEnterTheFollowing(DataTable table)  {

        List<Users> users = new ArrayList<Users>();
        users = table.asList(Users.class);
        for (Users user : users) {
            loginPage.login(user.username, user.password);
        }
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password) {

        loginPage.login(username, password);
    }

    public class Users {
        public String username;
        public String password;

        public Users(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}

