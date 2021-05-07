package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home;
import pages.Searh_Result;

public class UserSearch extends TestBase{
	
	
	Home homeObject;
	
	Searh_Result searhObject;
	
	
	@Test
	public void userSearchSucc() {
		
		homeObject = new Home(driver);
		homeObject.search("souq");
		searhObject = new Searh_Result(driver);
		System.out.println(searhObject.getText());
		searhObject.openFirstLink();
		Assert.assertTrue(driver.getTitle().contains("Best Deals on Souq.com Egypt"));
		
	}

}
