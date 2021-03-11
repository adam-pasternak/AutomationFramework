Feature: F-002 Cart

  Scenario: S-001 Add product to cart from PLP view
    Given Open URL: SAUCEDEMO
    When Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword secret_sauce
    And  Login page: click on field SUBMIT
    Then Product listing page: add random product to cart
    And  Product listing page: button of randomly selected product has value REMOVE
    And  Logged user panel: field AMOUNT_OF_PRODUCTS_IN_CART equals value 1
    When Logged user panel: click on field CART
    Then Cart page: product RANDOMLY_ADDED_TO_CART_PRODUCT exists in CART_PRODUCTS_LIST

  Scenario: S-002 Add product to cart from PDP view
    Given Open URL: SAUCEDEMO


  Scenario: S-003 Remove product from cart from PLP view
    Given Open URL: SAUCEDEMO


  Scenario: S-004 Remove product from cart from PDP view
    Given Open URL: SAUCEDEMO


  Scenario: S-005 Remove product from cart from cart view
    Given Open URL: SAUCEDEMO


  Scenario: S-006 Product visible is in cart after re-login
    Given Open URL: SAUCEDEMO
