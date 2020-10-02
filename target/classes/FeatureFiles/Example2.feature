Feature: Example Two

Scenario Outline:: Checking Example Two

Given user is on Orange login page
When user enter username "<Username>" and password "<Password>"
Then user gets into the logged in

Examples:
|Username|Password|
|Mahesh|Maroor|
|Manjushree|Yakhtpure|

