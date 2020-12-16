$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Account.feature");
formatter.feature({
  "line": 1,
  "name": "Create new Account for user and Account reated Activities.",
  "description": "",
  "id": "create-new-account-for-user-and-account-reated-activities.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11849266100,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "Navigate to Login Page and enter the following",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 4
    },
    {
      "cells": [
        "sakti5@gmail.com",
        "Ssakti@@5"
      ],
      "line": 5
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should navigate to Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.navigateToLoginPageAndEnterTheFollowing(DataTable)"
});
formatter.result({
  "duration": 624974500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.clickOnLoginButton()"
});
formatter.result({
  "duration": 6811614100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.iShouldNavigateToHomePage()"
});
formatter.result({
  "duration": 45369700,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "After login user should be able to create a new Account.",
  "description": "",
  "id": "create-new-account-for-user-and-account-reated-activities.;after-login-user-should-be-able-to-create-a-new-account.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "expand checking under Banking Accounts",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on new Checking",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "should be able to create a new Account with following details",
  "rows": [
    {
      "cells": [
        "accountType",
        "accountOwner",
        "accountName",
        "Deposite"
      ],
      "line": 13
    },
    {
      "cells": [
        "Interest Checking",
        "Joint",
        "Sakti-2",
        "23000"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "should be able to verify the created Account by increased notification Count",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDef.expand_checking_under_Banking_Accounts()"
});
formatter.result({
  "duration": 241353400,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDef.click_on_new_Checking()"
});
formatter.result({
  "duration": 7567817200,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDef.should_be_able_to_create_a_new_Account_with_following_details(DataTable)"
});
formatter.result({
  "duration": 25233890000,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDef.should_be_able_to_verify_the_created_Account_by_increased_notification_Count()"
});
formatter.result({
  "duration": 39095800,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1240007800,
  "status": "passed"
});
formatter.uri("Transaction.feature");
formatter.feature({
  "line": 1,
  "name": "User should be able to to do Transaction on an Existing Account",
  "description": "",
  "id": "user-should-be-able-to-to-do-transaction-on-an-existing-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "After login user should able to do Deposite and withdraw",
  "description": "",
  "id": "user-should-be-able-to-to-do-transaction-on-an-existing-account;after-login-user-should-able-to-do-deposite-and-withdraw",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "expand checking under Transaction Accounts",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on deposite",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "deposite form should open",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User should be able to select account  to do \u003cdeposite\u003e following",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "expand checking under Transaction Accounts",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click on withdraw",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Withdraw form should open",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User should be able to select account  to  do \u003cwithdraw\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "user-should-be-able-to-to-do-transaction-on-an-existing-account;after-login-user-should-able-to-do-deposite-and-withdraw;",
  "rows": [
    {
      "cells": [
        "deposite",
        "withdraw"
      ],
      "line": 20,
      "id": "user-should-be-able-to-to-do-transaction-on-an-existing-account;after-login-user-should-able-to-do-deposite-and-withdraw;;1"
    },
    {
      "cells": [
        "3500",
        "3847"
      ],
      "line": 21,
      "id": "user-should-be-able-to-to-do-transaction-on-an-existing-account;after-login-user-should-able-to-do-deposite-and-withdraw;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 15941835200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Navigate to Login Page and enter the following",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 5
    },
    {
      "cells": [
        "sakti8@gmail.com",
        "Ssakti@@8"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should navigate to Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.navigateToLoginPageAndEnterTheFollowing(DataTable)"
});
formatter.result({
  "duration": 327830900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.clickOnLoginButton()"
});
formatter.result({
  "duration": 7177684000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.iShouldNavigateToHomePage()"
});
formatter.result({
  "duration": 28426500,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "After login user should able to do Deposite and withdraw",
  "description": "",
  "id": "user-should-be-able-to-to-do-transaction-on-an-existing-account;after-login-user-should-able-to-do-deposite-and-withdraw;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "expand checking under Transaction Accounts",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on deposite",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "deposite form should open",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User should be able to select account  to do 3500 following",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "expand checking under Transaction Accounts",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click on withdraw",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Withdraw form should open",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User should be able to select account  to  do 3847",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TransactionStepDef.expand_checking_under_Transaction_Accounts()"
});
formatter.result({
  "duration": 172604600,
  "status": "passed"
});
formatter.match({
  "location": "TransactionStepDef.click_on_deposite()"
});
formatter.result({
  "duration": 10755204800,
  "status": "passed"
});
formatter.match({
  "location": "TransactionStepDef.deposite_form_should_open()"
});
formatter.result({
  "duration": 75569700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3500",
      "offset": 45
    }
  ],
  "location": "TransactionStepDef.user_should_be_able_to_select_account_to_do_following(int)"
});
formatter.result({
  "duration": 12082745600,
  "status": "passed"
});
formatter.match({
  "location": "TransactionStepDef.expand_checking_under_Transaction_Accounts()"
});
formatter.result({
  "duration": 125802100,
  "status": "passed"
});
formatter.match({
  "location": "TransactionStepDef.click_on_withdraw()"
});
formatter.result({
  "duration": 8210635200,
  "status": "passed"
});
formatter.match({
  "location": "TransactionStepDef.withdraw_form_should_open()"
});
formatter.result({
  "duration": 65498900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3847",
      "offset": 46
    }
  ],
  "location": "TransactionStepDef.user_should_be_able_to_select_account_to_do(int)"
});
formatter.result({
  "duration": 13241812800,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1504220200,
  "status": "passed"
});
});