#Feature: Registration of a new user
#  Scenario: New User Signup with correct user name,password and location details
#    When I navigate to Login Page and clicked on Signup link
#    And  Navigate to Signup Page and enter the following
#
#     |title|firstname|lastname|Gender|dateOfBirth |socialSecurityNo |email |password |confirmPassword|
#     |Mr. |Saktipada|Mishra  |M    |02/02/2200|009-02-1234 |sakti9@gmail.com|Ssakti@@9|Ssakti@@9|
#
#    And  click on next button
#    Then I should navigate to Address Details Form
#    And  I should be able to fill Address Details with following details
#
#    |address|locality|region|postalCode|country|homePhone|workPhone|mobileNumber|
#    |kolkata|Krishnapur  |WB    |700101    |India  |987654231|987654231|987654231|
#    And Should check terms and conditions box
#    Then  click on Register button
#    And  I should navigate to login Page
#    When Navigate to Login Page and enter the following
#      | username           | password |
#      | sakti9@gmail.com    | Ssakti@@9  |
#    And  click on Login button
#    Then I should navigate to Home Page
#
