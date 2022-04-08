Feature: scenario outline feature

  Scenario: normal scenario
    Given user write console "Java"

    When user add the following numbers
      | 5 |
      | 3 |
    When user add 5 and 3

    Then solution should be 8

    #Scenario outline da example verileri tüm senartoda kullanılabilir.
    #example daki baslik haric satır sayısı kadar sscenario tekrar eder

  Scenario Outline: scenario outline
    Given user write console "<consoleText>"

  When user add <number1> and <number2>

  Then solution should be <sonuc>


    Examples:
      | consoleText | number1 | number2 |sonuc|
      | Java        | 1       | 2       |3    |
      | Python      | 10      | 20      |30   |
      | C#          | 10      | 20      | 30    |
      | JavaScript  | 10      | 20      | 30    |
      | Kotlin      | 10      | 20      | 30    |
