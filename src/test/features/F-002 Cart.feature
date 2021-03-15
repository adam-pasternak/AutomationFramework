@Regression
Feature: F-002 Cart

  Scenario: S-001 Add product to cart from PLP view
    Given Browser: Open URL SAUCEDEMO
    When Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword secret_sauce
    And  Login page: click on field SUBMIT
    And  Product listing page: add random product to cart
    Then Product listing page: button of randomly selected product has value REMOVE
    And  Logged user panel: field AMOUNT_OF_PRODUCTS_IN_CART equals value 1
    When Logged user panel: click on field CART
    Then Cart page: product RANDOMLY_ADDED_TO_CART_PRODUCT exists in CART_PRODUCTS_LIST

  Scenario: S-002 Add product to cart from PDP view
    Given Browser: Open URL SAUCEDEMO
    When Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword secret_sauce
    And  Login page: click on field SUBMIT
    And  Product listing page: click on random field PRODUCT_NAME and save text from it as RANDOMLY_SELECTED_PRODUCT_NAME
    And  Product listing page: click on field ADD_TO_CART_BUTTON
    Then Product listing page: field ADD_TO_CART_BUTTON equals value REMOVE
    And  Logged user panel: field AMOUNT_OF_PRODUCTS_IN_CART equals value 1
    When Logged user panel: click on field CART
    Then Cart page: product RANDOMLY_SELECTED_PRODUCT_NAME exists in CART_PRODUCTS_LIST

  Scenario: S-003 Remove product from cart from PLP view
    Given Browser: Open URL SAUCEDEMO
    When Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword secret_sauce
    And  Login page: click on field SUBMIT
    And  Product listing page: add random product to cart
    Then Logged user panel: field AMOUNT_OF_PRODUCTS_IN_CART equals value 1
    When Logged user panel: click on field CART
    Then Cart page: product RANDOMLY_ADDED_TO_CART_PRODUCT exists in CART_PRODUCTS_LIST
    When Cart page: click on field CONTINUE_SHOPPING
    And  Product listing page: click on field REMOVE
    Then Logged user panel: field AMOUNT_OF_PRODUCTS_IN_CART is not displayed
    When Logged user panel: click on field CART
    Then Cart page: product RANDOMLY_ADDED_TO_CART_PRODUCT does not exists in CART_PRODUCTS_LIST

  Scenario: S-004 Remove product from cart from PDP view
    Given Browser: Open URL SAUCEDEMO
    When Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword secret_sauce
    And  Login page: click on field SUBMIT
    And  Product listing page: click on random field PRODUCT_NAME and save text from it as RANDOMLY_SELECTED_PRODUCT_NAME
    And  Product listing page: click on field ADD_TO_CART_BUTTON
    Then Logged user panel: field AMOUNT_OF_PRODUCTS_IN_CART equals value 1
    When Logged user panel: click on field CART
    Then Cart page: product RANDOMLY_SELECTED_PRODUCT_NAME exists in CART_PRODUCTS_LIST
    When Cart page: click on field CONTINUE_SHOPPING
    And  Product listing page: click on field PREVIOUSLY_ADDED_TO_CART_PRODUCT_NAME
    And  Product listing page: click on field REMOVE
    Then Logged user panel: field AMOUNT_OF_PRODUCTS_IN_CART is not displayed
    When Logged user panel: click on field CART
    Then Cart page: product RANDOMLY_SELECTED_PRODUCT_NAME does not exists in CART_PRODUCTS_LIST

  Scenario: S-005 Remove product from cart view
    Given Browser: Open URL SAUCEDEMO
    When Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword secret_sauce
    And  Login page: click on field SUBMIT
    And  Product listing page: add random product to cart
    And  Logged user panel: click on field CART
    Then Logged user panel: field AMOUNT_OF_PRODUCTS_IN_CART equals value 1
    And  Cart page: product RANDOMLY_ADDED_TO_CART_PRODUCT exists in CART_PRODUCTS_LIST
    When Cart page: click on field REMOVE
    Then Logged user panel: field AMOUNT_OF_PRODUCTS_IN_CART is not displayed
    And  Cart page: product RANDOMLY_ADDED_TO_CART_PRODUCT does not exists in CART_PRODUCTS_LIST

  Scenario: S-006 Product is visible in cart after re-login
    Given Browser: Open URL SAUCEDEMO
    When Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword secret_sauce
    And  Login page: click on field SUBMIT
    And  Product listing page: add random product to cart
    Then Logged user panel: field AMOUNT_OF_PRODUCTS_IN_CART equals value 1
    When Logged user panel: click on field MENU
    And  Logged user panel: click on field LOGOUT
    And  Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword secret_sauce
    And  Login page: click on field SUBMIT
    Then Logged user panel: field AMOUNT_OF_PRODUCTS_IN_CART equals value 1
    When Logged user panel: click on field CART
    Then Cart page: product RANDOMLY_ADDED_TO_CART_PRODUCT exists in CART_PRODUCTS_LIST