package commonUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMethods {


	public void Click (WebDriver driver, String Locator)
	
	{
		String[] Webloc= Locator.split("~~");
		if(Webloc[0].equalsIgnoreCase("name"))
		{
		driver.findElement(By.name(Webloc[1])).click();
		}
		
		if(Webloc[0].equalsIgnoreCase("xpath"))
		{
		driver.findElement(By.xpath(Webloc[1])).click();
		}
		
		if(Webloc[0].equalsIgnoreCase("linkText"))
		{
		driver.findElement(By.linkText(Webloc[1])).click();
		}
		
		if(Webloc[0].equalsIgnoreCase("id"))
		{
		driver.findElement(By.id(Webloc[1])).click();
		}
		
	}
	
		
	public void OpenWebSite(WebDriver driver, String InputData)
	
	{
	driver.get(InputData);	
	}
	
	

	public void enterTextBoxValue(WebDriver driver, String Locator,String InputData)
	{
		
		String[] Webloc = Locator.split("~~");
		if(Webloc[0].equalsIgnoreCase("Name"))
		{
		driver.findElement(By.name(Webloc[1])).sendKeys(InputData);
		}
		
		if(Webloc[0].equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(Webloc[1])).sendKeys(InputData);
		}
		
		if (Webloc[0].equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(Webloc[1])).sendKeys(InputData);
			
		}
		
		
		
	}
	
	
	public void selectDropdown (WebDriver driver, String Locator, String InputData, String Purpose) throws InterruptedException
	{
		
		String[] Webloc = Locator.split("~~");
		if(Webloc[0].equalsIgnoreCase("name"))
		{
		   Select sel = new Select (driver.findElement(By.name(Webloc[1])));
		   		   sel.selectByVisibleText(InputData);
		   
		}
		
		if(Webloc[0].equalsIgnoreCase("xpath"))
		{
		   Select sel = new Select (driver.findElement(By.xpath(Webloc[1])));
		  
		   sel.selectByVisibleText(InputData);
		   System.out.println(InputData);
			
		   
		}		
		
		if(Webloc[0].equalsIgnoreCase("id"))
		{
		   Select sel = new Select (driver.findElement(By.id(Webloc[1])));
		   
		   sel.selectByVisibleText(InputData);
		   
		   
		}	
		
		if(Webloc[0].equalsIgnoreCase("linkText"))
		{
		   Select sel = new Select (driver.findElement(By.linkText(Webloc[1])));
		 
		   sel.selectByVisibleText(InputData);
		   
		}	
		
		
		/*public void getText (WebDriver driver)
		{
			String String url = driver.getCurrentUrl();
		}
		*/
		
	/*	public void Title(WebDriver driver, )
		{
			String title = driver.getTitle();
		}*/
	
		
		
		
	}
	
	
	
}
