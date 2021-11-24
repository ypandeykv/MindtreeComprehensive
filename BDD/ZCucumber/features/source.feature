Feature: Source Url

Scenario: To Verify Source and Url
Given User Launch Browser
When Users Open Url "https://www.bigsmall.in/"
Then User Print Url and Source in the Console
And Close The Browser