@admin_set_price
Feature: Admin set fixed price

  Background:
    Given visitor open the website
    And visitor click on "masuk" element
    And visitor input email "admin@gmail.com"
    And visitor input password "admin"
    And visitor click on "login" button
    And admin click on dropdown menu
    And admin click on "list order" link
    And admin click on a detail in Order Konfirmasi

  @positive
  Scenario: Admin successfully set fixed price to an order
    When admin input "10000" to "Sesuaikan tarif" input
    And admin click on "Kirim" button
    Then admin can see the order fixed price

  @negative-set-price
  Scenario: Admin unsuccessfully set fixed price to an order
    When admin input "" to "Sesuaikan tarif" input
    And admin click on "Kirim" button
    Then admin can see that the price is still the same