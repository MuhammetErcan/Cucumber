Feature: Login functionality
Background: Login
  Given user goes to "http://opencart.abstracta.us/"
  And   user clicks to My Account
  And   user clicks Login link

  When  user input username as "ali@gmail.com" AND password as "123456"
  And   user clicks to submit button

  Then  login should be successfull


Scenario: User Account, telephon edition
  Given user click Edit Account
  Then  user edit telephon number "123456789"
  And   user click to continue
  And   success alert should be visible


Scenario: Change Newsletter subscribe
  Given user clicks Newsletter
  Then  user choose "Yes"
  And   user click to continue
  And   success alert should be visible