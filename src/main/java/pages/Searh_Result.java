package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searh_Result extends PageBase {

	public Searh_Result(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//div[@class='cfxYMc JfZTW c4Djg MUxGbd v0nnCb']")
	WebElement first_item;
	
	
	// Actions
	
	public String getText() {
		
	return first_item.getText();
		
	}
	
	public void openFirstLink() {
		
		clickButton(first_item);
		
	}

}
