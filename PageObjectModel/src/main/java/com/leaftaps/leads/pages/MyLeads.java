package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyLeads extends ProjectSpecificMethods {
	public MyLeads() { // Pagefactory code
	}
	
	public CreateLeadHomepage ClickcreateLead() {
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		return new CreateLeadHomepage();
		
	}

	
}
