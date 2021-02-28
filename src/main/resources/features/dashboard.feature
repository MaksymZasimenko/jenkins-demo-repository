Feature: Dashboards

  @regression
  Scenario: Adding new dashboard
    Given I navigate to Interview Prep
    Then I should see the "Login" page
    Then I enter "admin@yahoo.com" in the "Enter Username" input box
    Then I enter "adminUserPassword" in the "Enter Password" input box
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
    Then I enter "Khali" in the "New dashboard" input box
    Then I click "+ Add" button
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
    Then I enter "Khali" in the "New dashboard" input box
    Then I click "+ Add" button
    Then I should see "already exists" error message
    Then I delete the following dashboard:
      | Khali |
    Then I click "Delete" button


  Scenario Outline: Validate user can be able add and delete in "<sections>" section
    Given I navigate to Interview Prep
    Then I enter "test@yahoo.com" in the "Enter Username" input box
    Then I enter "testUserPassword" in the "Enter Password" input box
    And I click "Login" button
    Then I should see "<sections>" section
    Then I click "<buttons>" button
    Then I enter "message text" in the "Your Input..." input box
    Then I click "Enter" button
    And I validate "message text" is displayed in "<sections>" window
    Then I click "Delete" button of "message text"
    And I validate "message text" is  Not displayed in "<sections>" window
    Examples:
      | sections | buttons   |
      | Do's     | Add do    |
      | Dont's   | Add don't |


