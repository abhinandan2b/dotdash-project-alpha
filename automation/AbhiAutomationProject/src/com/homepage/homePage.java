package com.homepage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class homePage {
	
	@FindBy(how = How.NAME, using = config.CheckboxNo)
	public WebElement CheckboxNo;

	
	@Test
		   public static void OpenBrowser(){ 
		    WebDriver driver;
		        
		    System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", "BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.navigate().to("http://localhost/dashboard/dotdash-project-alpha/index.php");
			
		     
		        String url = "http://localhost/dashboard/dotdash-project-alpha/index.php";
		        HttpURLConnection huc = null;
		        int respCode = 200;
		        
		        driver = new ChromeDriver();
		        
		        driver.manage().window().maximize();
		        
		        driver.get(url);
		        
		        //List<WebElement> links = driver.findElements(By.tagName("a"));
		        
		        //Iterator<WebElement> it = links.iterator();
		        
		        
		            
		            /*url = it.next().getAttribute("href");
		            
		            System.out.println(url);
		        
		            if(url == null || url.isEmpty()){
		System.out.println("URL is either not configured for anchor tag or it is empty");
		                continue;
		            }
		            
		            if(!url.startsWith(homePage)){
		                System.out.println("URL belongs to another domain, skipping it.");
		                continue;
		            }*/
		            
		            try {
		                huc = (HttpURLConnection)(new URL(url).openConnection());
		                
		                huc.setRequestMethod("HEAD");
		                
		                huc.connect();
		                
		                respCode = huc.getResponseCode();
		                
		                if(respCode >= 200){
		                    System.out.println(url+" is a valid link");
		                    System.out.println(respCode + "OK");
		                }
		                else{
		                    System.out.println(url+" is a broken link");
		                }
		                    
		            } catch (MalformedURLException e) {		                
		                e.printStackTrace();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		        
		        //driver.quit();

		    }

          /* public static void verificationOfFields() {
        	    
       
           }*/

		//}
	//}

//}
