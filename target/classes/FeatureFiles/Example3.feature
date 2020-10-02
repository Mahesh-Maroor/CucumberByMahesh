Feature: Example One

Scenario: Checking Example Three

Given User about to sign in
When User about to Enter UserName and password
Then user is unable to log in

Scenario: Checking Example Three-2nd Scenario

Given User is not about to sign in
When User is not about to Enter UserName and password
Then user is able to log in