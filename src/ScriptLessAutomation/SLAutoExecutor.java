package ScriptLessAutomation;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;

public class SLAutoExecutor {
	Browser browser = null;
	WebDriver driver;
	public void startExecution() {
		String Input ="";
		Input =JOptionPane.showInputDialog("Please Enter Given Number to select the Browser: \n 1-Chrome    2-Edge");
		browser = new Browser(Input);
		browser.browser();		
	}
	
	
	public static void main(String[] args) {
		SLAutoExecutor slautoExecutor = new SLAutoExecutor();
		slautoExecutor.startExecution();
		}

	}


