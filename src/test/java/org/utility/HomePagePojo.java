package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePojo extends BaseClass {
	public HomePagePojo() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="(//li[@class='dropdown'])[3]")
	
	private WebElement report;
	
	@FindBy(xpath="//a[text()='Pending P.Os']")
	
	private WebElement pendingPo;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	
	private WebElement showFilter;
	
	@FindBy(xpath="//li[@title='All Locations']")
	
	private WebElement allLocations;
	
	@FindBy(xpath="//li[@title='All Vendors']")
	
	private WebElement allVendors;
	
	@FindBy(xpath="//li[text()='600639 - Sharp liqech test1']")
	
	private WebElement vendorName;
	
	@FindBy(xpath="//button[text()='Filter']")
	
	private WebElement filterButton;
	
	@FindBy(xpath="(//td[text()='1500'])[3]")
	
	private WebElement scroll;
	
	public WebElement getOptionCommon() {
		return optionCommon;
	}

	@FindBy(xpath="//span[@class='select2-results']")
	
	private WebElement optionCommon;
	
	@FindBy(xpath="//a[text()='1']")
	
	private WebElement scrolldown;

	public WebElement getScrolldown() {
		return scrolldown;
	}

	public WebElement getReport() {
		return report;
	}

	public WebElement getPendingPo() {
		return pendingPo;
	}

	public WebElement getShowFilter() {
		return showFilter;
	}

	public WebElement getAllLocations() {
		return allLocations;
	}

	public WebElement getAllVendors() {
		return allVendors;
	}

	public WebElement getVendorName() {
		return vendorName;
	}

	public WebElement getFilterButton() {
		return filterButton;
	}

	public WebElement getScroll() {
		return scroll;
	}

}
