Feature: Title Verification

Scenario: To Verify The Title of Page
Given User Launch Browser
When Users Open Url "https://www.bigsmall.in/"
Then Page Title Should Be Verified
And Close The Browser