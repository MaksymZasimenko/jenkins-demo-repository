Feature: Excel practice

  Scenario: Read excel file
    Then I validate the following row exists in "Sheet1" of "Book1.xlsx":
      | Central |
      | Morgan  |
      | Pencil  |

