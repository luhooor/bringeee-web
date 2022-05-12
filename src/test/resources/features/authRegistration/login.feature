@authregis @login
Feature: Login

  Background:
    Given visitor open the website

  @positive
  Scenario Outline: Visitor login successfully
    When visitor click on "masuk" element
    And visitor input email "<email>"
    And visitor input password "<password>"
    And visitor click on "login" button
    Then visitor logged in as "<role>" and redirected to "<page>"

  Examples:
    | email            | password | page         | role     |
    | nasrul@gmail.com | nasrul   | profile_page | customer |
    | feri@mail.com    | feri     | driver_page  | driver   |
    | admin@gmail.com  | admin    | admin_page   | admin    |

  @negative-authregis
  Scenario Outline: Visitor login unsuccessfully
    When visitor click on "masuk" element
    And visitor input email "<email>"
    And visitor input password "<password>"
    And visitor click on "login" button
    Then visitor should see "login" error message

  Examples:
    | email                    | password  | note                     |
    | adminBringeeah@gmail.com | adminPass | invalid email & password |
    |                          | nasrul    | without email            |
    | feri@mail.com            |           | without password         |
