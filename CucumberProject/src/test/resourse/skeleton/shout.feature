Feature: Shout Feature
Scenario: Sean shouts
Given Sean is 10 meters away from lucia
When  Sean shouts "Free Coffee"
Then  Lucia "listens" to the message

Scenario: Sean shouts
    Given Sean is 200 meters away from lucia
    When Sean shouts "Free Coffee"
    Then Lucia "can't listen" to the message