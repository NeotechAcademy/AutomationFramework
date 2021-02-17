package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class CheckoutStepTwo extends CommonMethods{

	
	@FindBy(xpath="//div[@class = 'inventory_item_name']")
	public WebElement itemName;
	
	
	public CheckoutStepTwo()
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
