Feature: user login to the page successful

  @unit1
  Scenario Outline: user login successful
    Given the user enters the username <username> and password <password>
    Then the user is at 'Home' page
    Examples:
      | username  | password   |
      | mngr39879 | mngr398793 |
