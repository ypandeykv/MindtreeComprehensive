Feature: Footer Verification

Scenario: To Verify The Footer of  The Page
Given User Launch Browser
When Users Open Url "https://www.bigsmall.in/"
Then Page Footer Text Should Be Verified
And Close The Browser