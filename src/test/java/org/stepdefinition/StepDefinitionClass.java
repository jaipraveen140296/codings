package org.stepdefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;
import org.utility.HomePagePojo;
import org.utility.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass extends BaseClass {
	
	LoginPojo l;
	HomePagePojo h;
	@Given("hit the chrome browser")
	public void hit_the_chrome_browser() {
		
	   			browserlaunch("chrome");
	}

	@When("Access the url")
	public void access_the_url() {
	    
		lauchurl("http://52.44.68.99:8086/buyer/users/login?redirect=%2Fbuyer");

		
	}

	@When("pass the username and password to the username and password textbox and click login button")
	public void pass_the_username_and_password_to_the_username_and_password_textbox_and_click_login_button() throws IOException{
	    
		l=new LoginPojo();
		String username1 = readDataFromCell("credentials", "Sheet1", 1, 0);
		String pass1 = readDataFromCell("credentials", "Sheet1", 1, 1);
		passtext(l.getUserName(), username1);
		passtext(l.getPassword(), pass1);
		clickElement(l.getLoginClick());
		
	}
	
	@When("click the report tab and select pending pos")
	public void click_the_report_tab_and_select_pending_pos() {
		h=new HomePagePojo();
		clickElement(h.getReport());
		clickElement(h.getPendingPo());
	    
	}

	@When("click the showfilter button and select all vendor select the vendor and click filter option")
	public void click_the_showfilter_button_and_select_all_vendor_select_the_vendor_and_click_filter_option() {
		h=new HomePagePojo();
		clickElement(h.getShowFilter());
		
		clickElement(h.getAllVendors());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement optionCommon = h.getOptionCommon();
		List<WebElement> options = optionCommon.findElements(By.tagName("li"));
		
		for (int i = 0; i < options.size(); i++) {
			WebElement itr = options.get(i);
			String text = itr.getText();
			
			if (text.equals("611506 - Vendor Name")) {
			itr.click();	
			}
		}
		
		clickElement(h.getFilterButton());
		
		
	}

	@Then("scroll and take screenshot of po")
	public void scroll_and_take_screenshot_of_po() throws IOException {
		h=new HomePagePojo();
		screenshot("poone.");
		scrollViewTrue(h.getScrolldown());
		screenshot("potwo.");
	
	}
	
	@When("go to URL")
	public void go_to_URL() {
	 
		lauchurl("http://52.44.68.99:8086/buyer/users/login?redirect=%2Fbuyer");
		
	}

	@When("pass the invalid credentials and click login")
	public void pass_the_invalid_credentials_and_click_login() throws IOException {
	    
		l=new LoginPojo();
		String username1 = readDataFromCell("credentials", "Sheet1", 2, 0);
		String pass1 = readDataFromCell("credentials", "Sheet1", 2, 1);
		passtext(l.getUserName(), username1);
		passtext(l.getPassword(), pass1);
		clickElement(l.getLoginClick());
		
	}




}
