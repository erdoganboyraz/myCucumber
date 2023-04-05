@google_search
Feature: ilk feature file
  @iphone
  Scenario: TC01_google_iphone_arama
    Given kullanıcı google a gider
    When kullanıcı iphone için arama yapar
    Then sonuçlarda iphone olduğunu doğrular
    And close the application

     @tesla
    Scenario: TC02_google_tesla_arama
      Given kullanıcı google a gider
      When kullanıcı tesla için arama yapar
      Then sonuçlarda tesla olduğunu doğrular
      And close the application
