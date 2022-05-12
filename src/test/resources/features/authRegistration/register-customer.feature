@authregis @register_customer
Feature: Registration Customer

  Background:
    Given visitor open the website

  @positive
  Scenario: Visitor register as customer successfully
    When visitor click on "daftar" element
    And visitor input all mandatory customer data
    And visitor click on "join" button
    Then visitor logged in as "customer" and redirected to "profile_page"

  @negative-authregis
  Scenario Outline: Visitor register as customer unsuccessfully
    When visitor click on "daftar" element
    And visitor input invalid data with condition: "<condition>"
    And visitor click on "join" button
    Then visitor should see "register" error message

  Examples:
    | condition             |
    | without_all_input     |
    | without_one_input     |
    | with_registered_email |