Feature: Adding the product to the cart
Scenario: user adds productto the cart and making payment
    Given URL of TestMeAppurl
    When user enters valid data for add cart 
    And checkout for payment
    And fills transaction details
    
    Then the product is successfully ordered