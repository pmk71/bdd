package StepDefination;

import Pages.SignInPage;
import io.cucumber.java.en.When;

public class Login {
	
	@When("User enter valid details")
	public void user_enter_valid_details() {
		SignInPage.sendkeys_username();
		SignInPage.sendkeys_password();
		SignInPage.click_on_login_btn();
		
	}

}
