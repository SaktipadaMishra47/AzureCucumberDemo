package Steps;


import Pages.AddressDetailsPage;
import Pages.LoginPage;
import Pages.UserDetailsPage;
import Utility.CommonUtil;
import Utility.LoggerHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;

import java.util.List;

public class SignupStepDef  {
        Logger log = LoggerHelper.getLogger(Steps.LoginStepDef.class);
        LoginPage loginPage = new LoginPage();
        UserDetailsPage userDetails = new UserDetailsPage();
        AddressDetailsPage addressDetails = new AddressDetailsPage();




        @When("^I navigate to Login Page and clicked on Signup link$")
        public void i_navigate_to_Login_Page_and_clicked_on_Signup_link() {
                loginPage.signUp();
        }

        @When("^Navigate to Signup Page and enter the following$")
        public void navigate_to_Signup_Page_and_enter_the_following(DataTable table) {
                List<UserDetails> users ;
                users = table.asList(UserDetails.class);
                for (SignupStepDef.UserDetails u : users) {
                        CommonUtil.performScrolldownToBottom();
                        new UserDetailsPage().fillUserDetails(u.title,u.firstname,u.lastname,u.gender,u.dateOfBirth,
                          u.socialSecurityNo,u.email,u.password,u.confirmPassword);

                }

        }

        @When("^click on next button$")
        public void click_on_next_button() {
        userDetails.clickOnNextBtn();

        }

        @Then("^I should navigate to Address Details Form$")
        public void i_should_navigate_to_Address_Details_Form() {
                CommonUtil.verifyPageContainsText("Address");
        }

        @Then("^I should be able to fill Address Details with following details$")
        public void i_should_be_able_to_fill_Address_Details_with_following_details(DataTable table) {
                List<AddressDetails> aDetails ;
                aDetails = table.asList(AddressDetails.class);
                for(AddressDetails a : aDetails){
                        CommonUtil.performScrolldownToBottom();
                        new AddressDetailsPage().fillAddressDetails(a.address,a.locality,a.region,
                                a.country,a.postalCode,a.homePhone,a.workPhone,a.mobileNumber);
                }
        }
        @Then("^Should check terms and conditions box$")
        public void should_check_terms_and_conditions_box() {
                new AddressDetailsPage().selectCheckBox();
        }
        @Then("^click on Register button$")
        public void click_on_Register_button() {
                new AddressDetailsPage().register();
        }





        public  class UserDetails {
                public String title;
                public String firstname;
                public String lastname;
                public String gender;
                public String dateOfBirth;
                public String socialSecurityNo;
                public String email;
                public String password;
                public String confirmPassword;


                public UserDetails(String title, String firstname, String lastname,String gender,
                                           String dateOfBirth,
                                           String socialSecurityNo, String email,
                                           String password,String confirmPassword)
                {
                        this.title = title;
                        this.firstname = firstname;
                        this.lastname = lastname;
                        this.gender = gender;
                        this.dateOfBirth = dateOfBirth;
                        this.socialSecurityNo= socialSecurityNo;
                        this.email = email;
                        this.password = password;
                        this.confirmPassword= confirmPassword;
                }
        }
        public  class AddressDetails {
                public String address;
                public String locality;
                public String region;
                public String country;
                public long postalCode;
                public long homePhone;
                public long workPhone;
                public long mobileNumber;

                public AddressDetails(String address, String locality,
                                              String region,
                                              String country, long postalCode,
                                              long homePhone, long workPhone,
                                              long mobileNumber) {
                        this.address = address;
                        this.locality = locality;
                        this.region = region;
                        this.country = country;
                        this.postalCode = postalCode;
                        this.homePhone= homePhone;
                        this.workPhone = workPhone;
                        this.mobileNumber = mobileNumber;

                }
        }

}
