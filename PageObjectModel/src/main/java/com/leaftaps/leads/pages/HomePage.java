package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public HomePage() { // Pagefactory code
	}

	public MyHome clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("working");
		return new MyHome();
	}
}
