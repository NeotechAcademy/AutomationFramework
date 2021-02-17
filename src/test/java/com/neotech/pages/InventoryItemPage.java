package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class InventoryItemPage extends CommonMethods {

	
	
	@FindBy(xpath= "//button[text()='ADD TO CART']")
	public WebElement addBtn;
	
	@FindBy(xpath = "//div[@id='shopping_cart_container']/a")
	public WebElement shoppingCard;
	
	public InventoryItemPage() 
	{
		PageFactory.initElements(driver, this);
	}
	

}
