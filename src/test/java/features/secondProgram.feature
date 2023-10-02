Feature: Application login

  Background: 
    When launch the browser from config variables
    And hit the home page url of banking site

  #Reusable
  @RegressionTest @NetBanking
  Scenario: User page default login
    Given User is on NetBanking Login Page
    When User login to application with "user" and password "12345"
    Then Home page is displayed
    And Cards are displayed

  @SmokeTest @RegressionTest @Mortgage
  Scenario Outline: Mortgage User page default login
    Given User is on NetBanking Login Page
    When User login to application with "<UserName>" and password "<PassWord>"
    Then Home page is displayed
    And Cards are displayed

    Examples: 
      | UserName   | PassWord   |
      | debituser  | achala$123 |
      | credituser | Hero123    |
