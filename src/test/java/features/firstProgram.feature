Feature: Application login

  Background: 
    Given Setup the entries in the database
    When launch the browser from config variables
    And hit the home page url of banking site

  @RegressionTest
  Scenario: Admin page default login
    Given User is on NetBanking Login Page
    When User login to application with "user" and password "01234"
    Then Home page is displayed
    And Cards are displayed

  #Reusable
  @MobileTest
  Scenario: User page default login
    Given User is on NetBanking Login Page
    When User login to application with "user" and password "12345"
    Then Home page is displayed
    And Cards are displayed

  @SmokeTest @RegressionTest
  Scenario Outline: User page default login
    Given User is on NetBanking Login Page
    When User login to application with "<UserName>" and password "<PassWord>"
    Then Home page is displayed
    And Cards are displayed

    Examples: 
      | UserName   | PassWord   |
      | debituser  | achala$123 |
      | credituser | Hero123    |

  @SmokeTest
  Scenario: User page default login
    Given User is on Practice landing Page
    When User signup into application
      | Vedavyas          |
      | PB                |
      | contact@gmail.com |
      |        9113656940 |
    Then Home page is displayed
    And Cards are displayed
