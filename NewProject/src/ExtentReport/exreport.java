package ExtentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class exreport
{
@Test
public void script()
{
	ExtentHtmlReporter rp=new ExtentHtmlReporter("./extent/report.html");
	System.out.println("Journey towards to IT");
	
	
	
	
	
	
	
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	
}
	
	
	
}
