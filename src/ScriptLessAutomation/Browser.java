package ScriptLessAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {

	String Input= null;
	WebDriver driver;
	
	 public Browser(String Input) {
		 this.Input = Input;
	 }
	 
	 public WebDriver browser() {
		 
         if(Input.equals("1")) {
        	 System.setProperty("webdriver.chrome.driver", "C:\\ScriptLessAutomation\\Lib\\chromedriver.exe");
        	 driver  = new ChromeDriver();	
		 }
         if(Input.equals("2")) {
			 System.setProperty("webdriver.edge.driver", "C:\\ScriptLessAutomation\\Lib\\msedgedriver.exe");
			 driver = new EdgeDriver();		
		 }
     	driver.manage().window().maximize();
		return driver;
		 
	 }
}
