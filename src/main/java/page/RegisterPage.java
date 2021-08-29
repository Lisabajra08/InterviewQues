package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage extends BasePage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//Library of Elements
	@FindBy(how=How.XPATH, using= "//option[@id='title']")
	WebElement TITLE_FIELD_ELEMENT;
	@FindBy(how=How.XPATH, using= "//input[@id='firstname']")
	WebElement USERNAME_FIELD_ELEMENT;
	@FindBy(how=How.XPATH, using= "//input[@id='lastName']")
	WebElement SURNAME_FIELD_ELEMENT;
	@FindBy(how=How.XPATH,using= "//div[@class='termsCheckbox']")
	WebElement CHECK_BOX_ELEMENT;
	@FindBy(how=How.XPATH,using= "//input[@id='submit']")
	WebElement SUBMIT_ELEMENT;
	
	//Methods to interact with the elements
	public void chooseTitleOption(String title) {
		selectDropDown(TITLE_FIELD_ELEMENT);
	}
	public void enterUserName(String name) {
		int generateNumber=randomGenerator(999);
		USERNAME_FIELD_ELEMENT.sendKeys(name);
	}
	public void enterSurName(String surName) {
		int generateNumber=randomGenerator(999);
		SURNAME_FIELD_ELEMENT.sendKeys(surName);
	}
	public void clickOnCheckBoxButton() {
		CHECK_BOX_ELEMENT.click();
		
	public void clickOnSubmitButton() {
		SUBMIT_ELEMENT.click();
	}
	
		
	
		
		
		
		
		
		
	}

	

}
