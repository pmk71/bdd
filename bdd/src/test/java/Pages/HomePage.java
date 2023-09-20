package Pages;

import org.openqa.selenium.By;

import Utility.BrowserDriver;

public class HomePage extends BrowserDriver {

	public static String hamberger_menu_xpath="//input[@type='checkbox']";

	public static String  signin_portal_link="//*[@id=\"menu\"]/a[2]/li";

	public static void click_hamberger_menu() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(hamberger_menu_xpath)).click();
	}

	public static void click_signinportal_btn() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(signin_portal_link)).click();
	}

}
