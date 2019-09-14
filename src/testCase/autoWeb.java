package testCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonUtility.KeywordMethods;
import excel.excelRead;

public class autoWeb {

	WebDriver driver;
	KeywordMethods keyobj = new KeywordMethods();
	

	@BeforeClass
	public void property()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANTH RK\\Desktop\\automationsoftware\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
	}

	@Test(dataProvider="methodData")
	public void Registration(String Keyword, String Locator, String InputData, String Purpose,String temp) throws InterruptedException
	{
		
		// objname . keywordword method name
		keyobj.execute(driver, Keyword, Locator, InputData, Purpose);
		
	}
	
	
	
	@DataProvider
	public String[][] methodData() throws IOException
	{
		String testdata[][] = excelRead.getDataFromExcel("testdatamr.xls", "Sheet1");
		return testdata;
		
	}

	@AfterClass
	public void close()
	{
		driver.close();
	}



}
