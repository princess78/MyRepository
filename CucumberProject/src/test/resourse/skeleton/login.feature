Feature: Login Feature
@valid
Scenario Outline: Valid User Scenario
Given The URL of TestMe App
When user enters <username> as username
And  user enters <password> as password
Then user in  <page>

Examples:
|username|password|page|
|Lalitha|Password123|Home|
|admin|Password456|Admin Home|
@invalid
Scenario: invalid scenario
Given The URL of TestMe App
When user enters invalid data
|abcxyz|Password123|
|Lalitha|abcxyz|
|abcxyz|abcxyz|
Then user is in login page
|bdc|
|abg|
|ghj|

