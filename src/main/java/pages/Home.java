package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends PageBase{

	public Home(WebDriver driver) {
		super(driver);
		
	}
	
	// elements 
	
	@FindBy(name = "q")
	WebElement search_box;
	
	
	
	
	// Actions 
	
	public void search(String input) {
		
		search_box.sendKeys(input);
		search_box.submit();
		
	}

}
