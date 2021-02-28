Feature: Login

#  @testLogin @regression
#  Scenario: opening the page
#    Given I navigate to Interview Prep
#    Then I should see the "Login" page
#    Then I enter "test@yahoo.com" in the "Enter Username" input box
#    Then I enter "testUserPassword" in the "Enter Password" input box
#    Then I click "Login" button
#    Then I should see the "Home" page
##    Then I click "Coding" button
##    Then I click "Enter new question " button
#
#  Scenario: opening the page
#    Given I navigate to Interview Prep
#    Then I should see the "Login" page
#    Then I enter "admin@yahoo.com" in the "Enter Username" input box
#    Then I enter "adminUserPassword" in the "Enter Password" input box
#    Then I click "Login" button
#    Then I should see the "Home" page
#    Then I click "Coding" button
#    Then I click "Enter new question " button

    #Create Scenario Outline which checks if the test user and admin user can successfully login


  Scenario Outline: Verify <user> user can login to HomePage
    Given I navigate to Interview Prep
    Then I should see the "Login" page
    Then I enter "<email>" in the "Enter Username" input box
    Then I enter "<password>" in the "Enter Password" input box
    Then I click "Login" button
    Then I should see the "Home" page
    Then I verify the following dashboards are displayed:
      | All Topics  |
      | Coding      |
      | Soft skills |
      | Cucumber    |
      | Java        |
      | Jmeter      |
      | API         |
      | SQL         |
      | Github      |
      | Khali       |

    Examples:
      | user  | email           | password          |
      | test  | test@yahoo.com  | testUserPassword  |
      | admin | admin@yahoo.com | adminUserPassword |


  Scenario Outline: Validate the dashboards
    Given I navigate to Interview Prep
    Then I should see the "Login" page
    Then I enter "<email>" in the "Enter Username" input box
    Then I enter "<password>" in the "Enter Password" input box
    Then I click "Login" button
    Then I should see the "Home" page
    Then I verify the following dashboards are displayed:
      | All Topics  |
      | Coding      |
      | Soft skills |
      | Cucumber    |
      | Java        |
      | Jmeter      |
      | API         |
      | SQL         |
      | Github      |
      | Khali       |

    Examples:
      | user  | email           | password          |
      | test  | test@yahoo.com  | testUserPassword  |
      | admin | admin@yahoo.com | adminUserPassword |







