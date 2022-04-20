Feature: user login to the page successful

  @unit123
  Scenario Outline: user login successful
    Given the user enters the username <username> and password <password>
    Then the user is at 'Home' page
    Examples:
      | username   | password |
      | mngr398793 | zarAqag  |
