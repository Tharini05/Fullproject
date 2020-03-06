Feature: Login
  As a end user
  I want to login
  So that I can Enter my details

  Scenario Outline: Login with invalid details
    Given I am in home page
    When I Click Account button
    And Enter the Email address "<Email>"
    And Enter the password "<Pwd>"
    Then Click sign in button
    And We should see the error messages "<Error message>"

    Examples:
   | Email                |  | Pwd     |  | Error message                                                               |
   | tharini_it@gmail.com |  | 1234456 |  | Sorry, we don't seem to recognise your email or password. Please try again. |
   | sri_13@gmail.com     |  | 1233434 |  | Sorry, we don't seem to recognise your email or password. Please try again. |

  @sprint2
  Scenario Outline: Login with valid details
  Given I am in home page
  When I Click Account button
  And Enter the Email address "<Email>"
  And Enter the password "<Pwd>"
  Then Click sign in button
  Examples:
  | Email                |  | Pwd     |
  | mtharinimca@gmail.com|  |abcde1   |
