package steps;

import io.cucumber.java.en.Given;

import static functions.SpecificFunctions.addRandomProductToCartFunction;
import static functions.SpecificFunctions.buttonOfRandomlySelectedProductHasValueFunction;

public class SpecificSteps {

    @Given("^(.+): add random product to cart")
    public void addRandomProductToCart(String pageName) {
        addRandomProductToCartFunction(pageName);
    }

    @Given("^(.+): button of randomly selected product has value (.+)")
    public void buttonOfRandomlySelectedProductHasValue(String pageName, String value) {
        buttonOfRandomlySelectedProductHasValueFunction(pageName, value);
    }
}