Feature: I go to search tool, and search for an item, I expect to see some reference to that item in the result summary.
  Scenario: Direct search item
    Given That I have gone to search page
    When User enters a text in search box
    Then User is navigated to  the Search Results page