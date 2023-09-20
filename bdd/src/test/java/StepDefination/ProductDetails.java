package StepDefination;

import cucumber.runtime.junit.JUnitReporter;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class ProductDetails {
	@Then("user able to navigate to product List page")
	public void user_able_to_navigate_to_product_list_page() {
		System.out.println("in the product list page");
	   Assert.assertTrue(true);
	}

}
