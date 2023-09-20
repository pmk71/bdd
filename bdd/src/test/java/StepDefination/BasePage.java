package StepDefination;

import Pages.HomePage;
import io.cucumber.java.en.Given;


public class BasePage {
	
	@Given("user navigate to Login page")
	public void user_navigate_to_login_page() throws InterruptedException {
	HomePage.click_hamberger_menu();
	HomePage.click_signinportal_btn();
	}

}
