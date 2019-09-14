package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyRead {



	public static void main(String[] args) throws IOException {

		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\testdata\\data.properties");
		obj.load(objfile);	
		
		
		String Value = obj.getProperty("URL");
		String Value1 = obj.getProperty("FIRSTNAME");
		String Value2 = obj.getProperty("LASTNAME");
		System.out.println(Value);
		System.out.println(Value1);
		System.out.println(Value2);




	}

}
