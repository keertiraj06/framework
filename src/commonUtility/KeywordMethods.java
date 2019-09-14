package commonUtility;

import org.openqa.selenium.WebDriver;

public class KeywordMethods {
	
	
	SeleniumMethods obj = new SeleniumMethods();
	
	public void execute(WebDriver driver, String Keyword, String Locator, String InputData, String Purpose) throws InterruptedException
	{
		switch(Keyword)
		{
		case "OpenWebSite":
		obj.OpenWebSite(driver, InputData);
			break;

		case "Click":
			obj.Click(driver, Locator);
			break;

		case "enterTextBoxValue":
			obj.enterTextBoxValue(driver, Locator, InputData);
			break;

		case"selectDropdown":
			obj.selectDropdown(driver, Locator, InputData,Purpose);
			break;

		default:
			System.out.println("Invalid Keyword");
			break;

		}
	}

}
	
	
	
	


