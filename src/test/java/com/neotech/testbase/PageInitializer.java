package com.neotech.testbase;

import com.neotech.pages.Cart;
import com.neotech.pages.CheckoutStepOne;
import com.neotech.pages.CheckoutStepTwo;
import com.neotech.pages.InventoryItemPage;
import com.neotech.pages.LoginPage;
import com.neotech.pages.MainPage;

public class PageInitializer extends BaseClass {

	public static LoginPage loginPage;
	public static MainPage mainPage;
	
	public static Cart cart;
	public static InventoryItemPage inventoryItemPage;
	public static CheckoutStepOne checkoutStepOne;
	public static CheckoutStepTwo checkoutStepTwo;
	
	
	

	public static void initialize() {
		// initialize pages
		loginPage = new LoginPage();
		mainPage = new MainPage();
		cart = new Cart();
		inventoryItemPage = new InventoryItemPage();
		checkoutStepOne = new CheckoutStepOne();
		checkoutStepTwo = new CheckoutStepTwo();
		
		
	}

}
