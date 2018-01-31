package com.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class VerificationDetails {
	
	WebDriver driver;
	
	public VerificationDetails (WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = config.CheckboxNo)
	public static WebElement CheckboxNo;
	
	@FindBy(how = How.XPATH, using = config.CheckboxNo6)
	public static WebElement CheckboxNo6;
	
	@FindBy(how = How.XPATH, using = config.CheckboxNo9)
	public static WebElement  CheckboxNo9;
	
	@FindBy(how = How.XPATH, using = config.CheckboxNo4)
	public static WebElement CheckboxNo4;
	
	@FindBy(how = How.XPATH, using = config.CheckboxNo7)
	public static WebElement CheckboxNo7;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = config.Text1)
	public static WebElement Text1;
	
	/*@FindBy(how = How.XPATH, using = config.CheckboxNo7)
	public static String CheckboxNo7*/
	
	/*public static final String  Text1 = "Finish reading research papers";
	public static final String  Text2 = "Sprint planning meeting (09/08/06)";
	public static final String  Text3 = "Soccer match! (29/08/14)";
	public static final String  Text4 = "Finish automation.";
	public static final String  Text5 = "My new test (02/02/16)";
	public static final String  Text6 = "hello";
	public static final String  Text7 = "Download installation ";
	public static final String  Text8 = "Test API";
	public static final String  allboxcheck = "allbox";
	public static final String  InputBoxAdd = "/html/body/div[4]/input[1]";*/
	@Test
	public static void verifydetails() throws InterruptedException {
		
		WebDriver driver;
        
	    System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://localhost/dashboard/dotdash-project-alpha/index.php");
		
		CheckboxNo.click();
		Thread.sleep(3000);
		String test = driver.findElement(By.xpath("//*[@id='todos-content']/form/ul/li[1]/span/strike")).getText();
		
		System.out.println(test);
		Thread.sleep(3000);
		/*driver.findElement(By.xpath(CheckboxNo9)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(CheckboxNo4)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(CheckboxNo7)).click();*/

	}

}
