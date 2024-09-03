package ScriptLessAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Objects {

	WebDriver driver;
	public Objects(WebDriver driver) {
		this.driver = driver;
	}

	//Login and Project Name
	
	 @FindBy(how = How.ID, using =  
	            "ChooseClient") 
	    WebElement Client; 
	 
	 @FindBy(how = How.XPATH, using =  
	            "//glf-input[@placeholder='Username']//input") 
	    WebElement UserName; 
	 
	 @FindBy(how = How.XPATH, using =  
	            "//glf-input[@placeholder='Password']//input") 
	    WebElement Password; 
	 
	 @FindBy(how = How.ID, using =  
	            "rememberMe") 
	    WebElement RememberMe; 
	 
	 @FindBy(how = How.TAG_NAME, using =  
	            "button") 
	    WebElement Login; 
	 
	 @FindBy(how = How.ID, using =  
	            "Project") 
	    WebElement Project; 
	 
	 @FindBy(how = How.XPATH, using =  
	            "//button[normalize-space()='Go']") 
	    WebElement Go;
	 
	 //
}
