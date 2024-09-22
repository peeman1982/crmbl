@testFooter
Feature: Testing footer links and buttons

  Background:
    Given I open the home page
    And I accept cookies

  @test1
  Scenario: I check Order link leads to Order page
    When I click on Order
    Then I verify Order page opens

  @test2
  Scenario: I check Our story link leads to Our story page
    When I click on Our story
    Then I verify Our story page opens
  @test3
  Scenario: I check Rewards link leads to Rewards page
    When I click on Rewards
    Then I verify Rewards page opens