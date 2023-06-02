Feature: Checking the product purchase functionality in Sauce demo Application
Background:
  Given user open the browser

@Tag1
Scenario Outline: Checking the login functionality
Given user Must Launch The Url
When user Enter The "<username>" In The Username Field
And user Enter The "<pass>" In The Password Field
Then user Click On Login Button and It Navigates To The Products Page

Examples:
|username|pass|
|abc|56787|
|xyz|34569|
|standard_user|secret_sauce|
