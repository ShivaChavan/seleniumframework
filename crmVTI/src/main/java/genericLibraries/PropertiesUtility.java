package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility extends BaseClass {

	public String readingDataFromPropertyFile(String key)  {
		FileInputStream file=null;
		try {
			file = new FileInputStream(IAutoConstants.PROPERTYFILE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties property = new Properties();
		try {
			property.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property.getProperty(key);

	}
	
}
