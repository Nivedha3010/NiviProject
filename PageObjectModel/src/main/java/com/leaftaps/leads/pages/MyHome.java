package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyHome extends ProjectSpecificMethods{
	public MyHome() { // Pagefactory code
	}

	public MyLeads clickLeads() {
	driver.findElementByXPath("//a[text()='Leads']").click();
	System.out.println("notworking");
		return new MyLeads();
		
	}

}
