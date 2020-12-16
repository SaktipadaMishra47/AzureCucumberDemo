Feature: Login Functionality
  @Smoke
  Scenario: Login with correct username and password
    When Navigate to Login Page and enter the following
      | username | password |
      | sakti9@gmail.com    | Ssakti@@9  |
    And  click on Login button
    Then I should navigate to Home Page
    And  click on My profile Logo
    And  I should click on logout button
    Then I should navigate to login Page
# @Regression
##  Scenario Outline: Login with Invalid credentials
##    When Navigate to Login Page and enter the following <username> and <password>
##    And  click on Login button
##    Then I should not navigate to Home Page
##    Examples:
##      | username | password  |
##      | user1    | password1 |

