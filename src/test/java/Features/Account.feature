 Feature: Create new Account for user and Account reated Activities.
   Background:
     When Navigate to Login Page and enter the following
        | username | password |
        | sakti9@gmail.com    | Ssakti@@9   |
     And  click on Login button
     Then I should navigate to Home Page
   @smoke
   Scenario: After login user should be able to create a new Account.
      When expand checking under Banking Accounts
      And  click on new Checking
      And should be able to create a new Account with following details
       |accountType      |accountOwner|accountName|Deposite|
       |Interest Checking|Joint       |Sakti-2      |23000   |
      And should be able to verify the created Account by increased notification Count

