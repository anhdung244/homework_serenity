Feature: user login to the page unsuccessful

  @unit
  Scenario Outline: user login unsuccessful
    Given the user enters the username <username> and password <password>
    Then the error message 'User is not valid' is displayed
    Examples:
      | username   | password   |
      | mngr398793 | mngr3      |
      | mngr3      | mngr398793 |
      | ""         | mngr398793 |
      | mngr398793 | ""         |