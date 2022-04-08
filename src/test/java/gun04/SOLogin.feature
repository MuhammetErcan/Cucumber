Feature: Login assert with scenario outline

  Scenario Outline: login functionality
    Given user goes to "http://opencart.abstracta.us/"
    And  user clicks to My Account
    And  user clicks Login link
    #When user fill the login form as "<username" and "<password>"

    When user fill the login form as follows
      | username | <username> |
      | password | <password> |

    Then login should be "status"
    And   closeBrowser

    Examples:
      | username       | password   | status |
      | ali@gmail.com  | 123456     | true   |
      | ali1@gmail.com | 123456     | false  |
      | ali@gmail.com  | 1234564535 | false  |
      | ali@gmail.com  | 123456     | true   |

     #    When user fill the login form as "<username>" and "<password>"

  @LoginTestScenario
  Scenario: login functionality scenario

    Given user goes to "http://opencart.abstracta.us/"
    And   user clicks to My Account
    And   user clicks Login link
    When  user fill the login form as follows
      | username | testngkurs@gmail.com |
      | password | testngkurs |

    Then  login shoud be "true"
    And   closeBrowser