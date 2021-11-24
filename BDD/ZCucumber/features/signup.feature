Feature: SignUp Verification

Scenario: To Verify The Signup Functionality
Given User Launch Browser
When Users Open Url "https://www.bigsmall.in/"
Then User click On Signin
Then User click on create account Enter Firstname Lastname Email,Password and  finally press Create Button
And Close The Browser