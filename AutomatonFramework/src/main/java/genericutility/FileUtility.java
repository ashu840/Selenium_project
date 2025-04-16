package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	/**
	 * @author ashutosh
	 */
	
/**
 * It is used to read data from property file
 * User must pass key and it return value
 * @param key
 * @return
 * @throws IOException
 */
	
	
	public String getDataFromProperty(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commondata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		//read data
		return pro.getProperty(key);
		
	}

}
