@testHomePage
Feature: Testing basic pages

  Background:
    Given I open the home page
    And I accept cookies

  @test1
  Scenario: I click to hamburger menu
    When I click on Menu
    Then I verify Menu modal opens
  @test2
  Scenario: I click to Order now
    When I click on Order Now
    Then I verify Order page opens
