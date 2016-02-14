@issue25
Feature: First feature with dupes

  Scenario Outline: First dupes outline
    When in scenario <URL>
    Then all ok

    Examples: 
      | URL           |
      | http://fb.com |
