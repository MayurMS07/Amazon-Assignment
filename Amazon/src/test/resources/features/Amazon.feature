Feature: Amazon Website Functionality

  Scenario: Search for iPhone, select product, and add to cart
    Given the user is on the home page
    When the user searches for "iPhone"
    And selects "iPhone" from the search results
    And goes to the product details page
    And selects and stores the price in a variable
    And adds the iPhone to the cart
    Then the iPhone should be in the user's cart with the correct price