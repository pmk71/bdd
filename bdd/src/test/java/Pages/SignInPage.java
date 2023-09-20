package Pages;

import org.openqa.selenium.By;

import Utility.BrowserDriver;

public class SignInPage extends BrowserDriver {
	
	public static String username_txft_id="usr";
	public static String password_txft_id="pwd";
	public static String login_btn_xpath="/html/body/center[1]/div/form/input";
	public static String register_new_user_xpath="//div[@class='jumbotron text-left']";
	
	
	
	public static void sendkeys_username() {
		driver.findElement(By.id(username_txft_id)).sendKeys("hi");
	}
	
	
	public static void sendkeys_password() {
		driver.findElement(By.id(password_txft_id)).sendKeys("hi");		
	}
	
	public static void click_on_login_btn() {
		
		driver.findElement(By.xpath(login_btn_xpath)).click();
	}
	
	public static void click_on_new_user_registration() {
		driver.findElement(By.xpath(register_new_user_xpath));	
	}
	

}
