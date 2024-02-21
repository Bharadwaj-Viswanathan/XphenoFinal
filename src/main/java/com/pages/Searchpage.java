package com.pages;

import org.openqa.selenium.By;
import com.testcases.BaseClass;

public class Searchpage extends BaseClass{
	
	static By us = By.xpath("//input[@name='username']");
	static By pw = By.xpath("//input[@name='password']");
	static By submit = By.xpath("//button[@type='submit']");
	static By csearch = By.xpath("//span[text()='Candidate Search']");
	static By inputField = By.xpath("//input[@placeholder='Search Keyword']");
	static By search = By.xpath("//button[text()='Search']");
	static By randomname = By.xpath("//input[@placeholder='Search Keyword']");
	static By randomdropdown = By.xpath("//div[@class='search-result-body MuiBox-root css-0']//div//span//input//following::div//div[@class='search-result-candidate-name MuiBox-root css-0']");
	
	
public static void searchflow() {
	sendKeys(element(us), "vinoth.shankar@impigertech.com");

	sendKeys(element(pw), "impiger#123");

	clickElement(element(submit));

	sleeptime();	

	clickbyjavascript(element(csearch));

	randomname(element(randomname), "keyword");

	sendkeywithbackspace(element(inputField));
	
	clickElement(element(search));

	RandomDropDown();

}
}
