package ScriptLessAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	
	String Config = "C:\\ScriptLessAutomation\\Lib\\config.properties";
	static Properties prop  =null;
	FileInputStream fis =null;	
	public Config() throws IOException {	
		 this.prop = new Properties();
		 this.fis = new FileInputStream(Config);
		 prop.load(fis);
	}
	
public static String getConfigData(String Key) throws IOException {
		String Value =null;
		try{
		    Value = prop.getProperty(Key);
		    return Value;
		} catch (Exception ex) {
		    ex.printStackTrace();
		}
		return Value;		
		}
}
