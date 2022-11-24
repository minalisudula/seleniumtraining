Feature: working on amazon page
Scenario: web application

Given user is in amazon page
When user captures links
Then user gets url and title
Then stores in xl sheet
And closes browser