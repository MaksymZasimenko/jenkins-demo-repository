#Feature: Archive
#
#
#  ###########################################    LOGIN Feature:
#
#  @test3 @test1 @regression @shakeout @miniregression
#  Scenario: Login with invalid credentials - invalid email
#    Then I enter "test@gmail.com" in the Email input box
#    And I enter "test123" in the Password input box
#    And I click "Login" button
#    Then I should see a "Incorrect username/password" error message
#    Then I validate I am on "login" page
#
#  @test4
#  Scenario: Login with invalid credentials - invalid password
#    Then I enter "test@yahoo.com" in the Email input box
#    And I enter "testinvalid" in the Password input box
#    And I click "Login" button
#    Then I should see a "Incorrect username/password" error message
#    Then I validate I am on "login" page
#
#  @test5
#  Scenario: Login with invalid credentials - empty fields
#    And I click "Login" button
#    Then I should see a "Incorrect username/password" error message
#    Then I validate I am on "login" page
#    Then I validate I am on "login" page
#
#
#
#
#
############################################    DASHBOARD Feature:
#
#
#
#  Scenario Outline: Validate user can be able add and delete in "<sections>" section
#    Given I navigate to Interview Prep
#    Then I enter "test@yahoo.com" in the "Enter Username" input box
#    Then I enter "testUserPassword" in the "Enter Password" input box
#    And I click "Login" button
#    Then I should see "<sections>" section
#    Then I click "<buttons>" button
#    And I enter "message text" in input box
#    Then I click "Enter" button
#    And I validate "message text" is displayed in "<sections>" window
#    Then I click "Delete" button
#    And I validate "message text" is  Not displayed in "<sections>" window
#    Examples:
#      | sections | buttons   |
#      | Do's     | Add do    |
#      | Dont's   | Add don't |
#
#
#
#
##when the user clicks on each dashboard icon, the user should be directed to the dashboard page
#
#  Scenario Outline: Validating <dashboard> page
#    Given I navigate to Interview Prep
#    Then I should see the "Login" page
#    Then I enter "admin@yahoo.com" in the "Enter Username" input box
#    Then I enter "adminUserPassword" in the "Enter Password" input box
#    Then I click "Login" button
#    Then I should see the "Home" page
#    Then I click "<dashboard>" button
#    Then I should see the "<dashboard>" page
#    Examples:
#      | dashboard   |
#      | All Topics  |
#      | Coding      |
#      | Soft skills |
#      | Cucumber    |
#      | Java        |
#      | Jmeter      |
#      | API         |
#      | SQL         |
#      | Github      |
#
#
#  Scenario Outline:
#    Given I navigate to Interview Prep
#    Then I should see the login page
#    Then I enter "test@yahoo.com" in the Email input box
#    And I enter "testUserPassword" in the Password input box
#    And I click "Login" button
#    Then I validate I am on "Interview Prep home" page
#    Then I click "<dashboard>" button
#    Then I should see the "<dashboard>" page
#    Then I click "Enter new question" button
#    Then I enter "What is JAVA?" in "Your question" input
#    Then I click "Enter" button
#    Then I validate "What is JAVA?" question displayed
#    Then I validate question "What is JAVA?" has datestamp
#    And I delete question "What is JAVA?"
#    Then I validate "What is JAVA?" question is NOT displayed
#    Examples:
#      | dashboard   |
#      | All Topics  |
#      | Coding      |
#      | Soft skills |
#      | Cucumber    |
#      | Java        |
#      | Jmeter      |
#      | API         |
#      | SQL         |
#      | Github      |
#
#
#
#
############################################    MANAGE ACCESS Feature:
#  Scenario: Validate new user form
#    Given I navigate to Interview Prep
#    Then I should see the login page
#    Then I enter "admin@yahoo.com" in the Email input box
#    And I enter "adminUserPassword" in the Password input box
#    And I click "Login" button
#    Then I validate I am on "Interview Prep home" page
#    And I click "Manage Access" link
#    Then I validate the following "input" fields
#      | First Name |
#      | Last Name  |
#      | E-mail     |
#    Then I validate the following "dropdown" fields
#      | Role  |
#      | Batch |
#    Then I validate the following options are displayed in "Role" dropdown
#      | Student    |
#      | Instructor |
#      | Mentor     |
#    Then I validate the following options are displayed in "Batch" dropdown
#      | N/A |
#      | 1   |
#      | 2   |
#      | 3   |
#      | 4   |
#      | 5   |
#      | 6   |
#      | 7   |
#      | 8   |
#      | 9   |
#      | 10  |
#
#
#  Scenario Outline: Admin user adds <role>
#    Given I navigate to Interview Prep
#    Then I should see the login page
#    Then I enter "admin@yahoo.com" in the Email input box
#    And I enter "adminUserPassword" in the Password input box
#    And I click "Login" button
#    Then I validate I am on "Interview Prep home" page
#    And I click "Manage Access" link
#    Then I enter "<firstname>" in the firstname input
#    Then I enter "<lastname>" in the lastname input
#    Then I enter "<email>" in the email input
#    Then I enter "<role>" in the role input
#    Then I enter "<batch>" in the batch input
#    Then I click "Add user" button
#    Then verify the following user exists in the table
#      | First name | <firstname> |
#      | Last name  | <lastname>  |
#      | Email      | <email>     |
#      | Role       | <role>      |
#      | Batch      | <batch>     |
#
#    Examples:
#      | firstname | lastname | email        | role       | batch |
#      | John      | Smith    | js@yahoo.com | Instructor | N/A   |
#      | John      | Smith    | js@yahoo.com | Student    | 1     |
#      | John      | Smith    | js@yahoo.com | Mentor     | N/A   |
#
#
############################################    SUNDAY REVIEW Feature:
#
#  @test1
#  Scenario: Validate adding a new Do statement will display in Do section
#    When I enter "Talk clear" in "Do" input field
#    And I click "Enter Do" button
#    Then I validate "Talk clear" is displayed in "Do" section
#
#  @test2 @dont @smoke @test1
#  Scenario: Validate adding a new Dont statement will display in Dont section
#    When I enter "Dont chew a gum" in "Dont" input field
#    And I click "Enter Dont" button
#    Then I validate "Dont chew a gum" is displayed in "Dont" section
#
#  Scenario: Verify Like, Delete and Edit options are displayed
#    Then I click "Add do" button
#    Then I enter "QWERTY" in "Your Input..." input field
#    And I click "Enter" button
#    Then I verify "Edit" button is enabled
#    Then I verify "Delete" button is enabled
#    Then I verify "Like" button is enabled
#    Then I verify "Dislike" button is enabled
#
#  @buttonTest
#  Scenario: Verify Like, Delete and Edit options are displayed
#    Then I click "Add do" button
#    Then I enter "QWERTY" in "Your Input..." input field
#    And I click "Enter" button
#    Then I verify following buttons are enabled:
#      | Edit    |
#      | Delete  |
#      | Like    |
#      | Dislike |
#
#  Scenario Outline: Test Do functions with short,empty and long statements and delete it
#    Then I enter "<Username>" in the Email input box
#    And I enter "<password>" in the Password input box
#    Examples:
#      | Username | password |
#      | user 1   | pass 1   |
#      | user 2   | pass 2   |
#      | user 3   | pass 3   |
#      | user 4   | pass 4   |
#
##  CLASS TASK:
##  Test Do functionality.
##  User should be able to add statements
##  User should be able to edit or delete own statements only.
#  Scenario: Validate user is able to add statements
#    Then I click "Add do" button
#    Then I enter "QWERTY statement" in "Your Input..." input field
#    And I click "Enter" button
#    Then I validate "QWERTY statement" is displayed in "Do" section
#
#  Scenario: Validate user is able to edit statements
#    Then I validate "QWERTY statement" is displayed in "Do" section
#    Then I click "Edit" button
#    And I enter "YTREWQ statement" in "Edit" input field
#    And I click "Done" button
#    Then I validate "YTREWQ statement" is displayed in "Do" section
#
#  Scenario: Validate user is able to delete statements
#    Then I validate "QWERTY statement" is displayed in "Do" section
#    Then I click "Delete" button
#
#
#
#
#
