# açıklamalar # ile yapılır

  #her fuature dosyası Feature ile başlar
  # bu feature ile ilgili detaylı açıklama yapılır
  Feature: Ilk feature denemesi
    Cucumber baslangici calismasi



  # testler Scenariolar şeklinde yazılır

  Scenario: ilk senaryomuz
    Given user on home page
    When  user clicks to login button
    Then  login form should be visible

    # Given Whwn Than And But annotationlarının kısıtlayıcı bir tarafı yok

  Scenario: senario2
    Given user on home page senario
    And user goes to login form
    When user input username
    And user input password
    And user clicks to login button
    Then  page title should be My account
    And  My Account page should be visible
