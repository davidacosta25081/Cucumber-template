Feature: Testing login on a Page

Scenario Outline: Logging in successfully with credentials

Given user is on login page
When user enters <username> and <password>
And user clicks login
Then user is navigated to the home page

Examples:
|username|password|
|Gabriel |12345|
|David   |12345| 