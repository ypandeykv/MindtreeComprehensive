Feature: Searching Box

Scenario: To Verify Search box functionality
Given User Launch Browser
When Users Open Url "https://www.bigsmall.in/"
Then User Enter "Bag" on the searchbox and bag items are displayed
And Close The Browser