Feature: Manage Access


  Scenario: Verify admin can add new users
    Given I navigate to Interview Prep
    Then I should see the "Login" page
    Then I enter "admin@yahoo.com" in the "Enter Username" input box
    Then I enter "adminUserPassword" in the "Enter Password" input box
    And I click "Login" button
    Then I should see the "Home" page
    And I click "Manage Access" link
    Then I enter the following values in the following fields
      | First Name | Will                 |
      | Last Name  | Smith                |
      | E-mail     | will.smith@gmail.com |
    And I choose "Instructor" from dropdown "Role"
    And I choose "10" from dropdown "Batch"
    And I click "Add User" button
    ###### Work on the following steps
    Then verify the following user exists in the table
      | First Name | admin           |
      | Last Name  | admin           |
      | E-mail     | admin@yahoo.com |
      | Role       | Mentor          |
      | Batch      | N/A             |
    And I click "Action" button of user "will.smith@gmail.com"
    And I click "Edit" button
    Then I edit the user with following
      | Email | will.smith.new@gmail.com |
      | Role  | Mentor                   |
      | Batch | N/A                      |
    Then I click "Update User" button
    Then verify the following user exists in the table
      | First Name | Will                     |
      | Last Name  | Smith                    |
      | E-mail     | will.smith.new@gmail.com |
      | Role       | Mentor                   |
      | Batch      | N/A                      |
    And I click "Action" button of user "will.smith.new@gmail.com"
    Then I click "Delete" button
    And I click "Delete" button in "User Delete Window"
    Then verify the following user does NOT exist in the table
      | First Name | John                 |
      | Last Name  | Smith                |
      | E-mail     | john.smith@gmail.com |
      | Role       | Instructor           |
      | Batch      | 4                    |



