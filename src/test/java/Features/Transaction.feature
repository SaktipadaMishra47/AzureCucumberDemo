Feature: User should be able to to do Transaction on an Existing Account

  Background:
    When Navigate to Login Page and enter the following
  | username | password |
  | sakti8@gmail.com    | Ssakti@@8   |
    And  click on Login button
    Then I should navigate to Home Page
  @smoke
  Scenario Outline:After login user should able to do Deposite and withdraw
    When expand checking under Transaction Accounts
    And  click on deposite
    Then deposite form should open
    And  User should be able to select account  to do <deposite> following
    When expand checking under Transaction Accounts
    And  click on withdraw
    Then Withdraw form should open
    And  User should be able to select account  to  do <withdraw>
    Examples:
      | deposite | withdraw |
      |3500     |3847      |
