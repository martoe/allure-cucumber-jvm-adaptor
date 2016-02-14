@issue25
Feature: Second feature with dupes

  Scenario Outline: Second dupes outline
    When in scenario <URL>
    Then all ok

    Examples: 
      | URL           |
      | http://fb.com |
