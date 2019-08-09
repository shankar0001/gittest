package Demo;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tsesting_the_facebook {

	
		
		
		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver" , "/home/dz-jp-31/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://dev.decipherzone.com/dms-dev/");
			Thread.sleep(2000);
			
			
			//For Login Functionality
			
			
			///with incorrect email 
			
			driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("admin@.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("123123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
			Thread.sleep(2000);
			
			//Remove the entries from the fields
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();
			driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).clear();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("admin@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();
			driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("admin@gmail..com  ");
			driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
			
			driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();
			driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).clear();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("admin@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("123123");
			driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
			Thread.sleep(5000);
			 
			
	//---------------------------For User management Module---------------------------------		

			driver.findElement(By.xpath("//a[@mattooltip=\"User Management\"]")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class=\"mat-button-wrapper\"][text()=\"Domain\"]")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@id=\"mat-input-2\"]")).sendKeys("autotest");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("this is the automation script test");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class=\"py-_6 mat-flat-button mat-warn\"]")).click();
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			//Perform edit action on Domain
			
			driver.findElement(By.xpath("(//MAT-ICON[@_ngcontent-c21=''][text()='edit'][text()='edit'])[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[5]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@rows=\"6\"]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder=\"Domain Name\"]")).sendKeys("autoedit");
			driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("edit action on doamin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class=\"py-2 mat-flat-button mat-warn\"]")).click();
			Thread.sleep(2000);
			
			//PERFORM DEACTIVATE ACTION ON DOMAIN
			driver.findElement(By.xpath("(//I[@_ngcontent-c21=''])[4]")).click();
			
			//PERFORM ACTIVATE ACTION ON DOMAIN	
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//I[@_ngcontent-c21=''])[4]")).click();
			
			//PERFORM DELETE ACTION ON DOMAIN
			
			driver.findElement(By.xpath("(//MAT-ICON[@_ngcontent-c21=''][text()='delete'][text()='delete'])[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='mat-button-wrapper'][text()='Cancel']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//MAT-ICON[@_ngcontent-c21=''][text()='delete'][text()='delete'])[4]")).click();
			driver.findElement(By.xpath("//span[@class='mat-button-wrapper'][text()='Delete']")).click();
			
			
			//ROLE MODULE
			
			driver.findElement(By.xpath("//mat-icon[@_ngcontent-c3=''][text()='sentiment_satisfied_alt']")).click();
			Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name=\"roleName\"]")).sendKeys("Quality analystttt");
	        Thread.sleep(6000);
	        driver.findElement(By.xpath("//mat-select[@formcontrolname=\"domainIds\"]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[@class='mat-option-text'][text()=' jkl infotech ']")).click();
	        driver.findElement(By.xpath("//span[@class='mat-option-text'][text()=' mno infotech ']")).click();
	        Thread.sleep(2000);
	       
	        driver.findElement(By.xpath("//textarea[@placeholder=\"Descriptions\"]")).sendKeys("for testing purpose");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//span[contains(text(),'Create Role')]")).click();
	        
	        
	 //---------------------USER MODULE_-----------------------------------------------------------------------
	        
	      
	    /*    driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[5]")).click();
	        Thread.sleep(2000);


	        Actions actions = new Actions(driver);

	        actions.moveToElement(driver.findElement(By.xpath("//MAT-ICON[@_ngcontent-c21=''][text()='more_horiz']"))).click().perform();
		*/
		
	//------------------------------Access Management-----------------------------------------	
	       driver.findElement(By.xpath("//span[contains(text(),'Access Management')]")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//span[contains(text(),'User Access Management')]")).click();
	       Thread.sleep(8000);
	      driver.findElement(By.cssSelector("body.dashboard-bg:nth-child(2) mat-drawer-container.nav-container.mat-drawer-container mat-drawer-content.mat-drawer-content:nth-child(5) div.mt-4.wrapper app-access-management.ng-star-inserted:nth-child(2) div.container app-users-access-management.ng-star-inserted:nth-child(2) mat-card.mat-card:nth-child(2) mat-card-content.mat-card-content:nth-child(2) div.mat-elevation-z8 table.mat-table tr.mat-row.ng-star-inserted:nth-child(4) td.mat-cell.cdk-column-action.mat-column-action.ng-star-inserted:nth-child(6) button.mat-icon-button.mat-primary span.mat-button-wrapper > mat-icon.mat-icon.notranslate.material-icons.mat-icon-no-color")).click();
		
		  driver.findElement(By.xpath("//mat-select[@role=\"listbox\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[@class=\"mat-option-text\"][text()=' ss ']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//DIV[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//DIV[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[5]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//SPAN[@class='mat-button-wrapper'])[15]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//SPAN[@class='mat-button-wrapper'])[5]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("body.dashboard-bg:nth-child(2) mat-drawer-container.nav-container.mat-drawer-container mat-drawer-content.mat-drawer-content:nth-child(5) div.mt-4.wrapper app-access-management.ng-star-inserted:nth-child(2) div.container app-roles-access-management.ng-star-inserted:nth-child(2) mat-card.mat-card:nth-child(2) mat-card-content.mat-card-content:nth-child(2) div.mat-elevation-z8 table.mat-table tr.mat-row.ng-star-inserted:nth-child(3) td.mat-cell.cdk-column-action.mat-column-action.ng-star-inserted:nth-child(3) button.mat-icon-button.mat-primary span.mat-button-wrapper > mat-icon.mat-icon.notranslate.material-icons.mat-icon-no-color")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//mat-select[@role=\"listbox\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[@class=\"mat-option-text\"][text()=' ss ']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//DIV[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[3]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//SPAN[@class='mat-button-wrapper'])[15]")).click();
		  Thread.sleep(2000);
		 driver.findElement(By.xpath("(//SPAN[@class='mat-button-wrapper'])[6]")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//tr[5]//td[4]//button[1]//span[1]//mat-icon[1]")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//mat-select[@role=\"listbox\"]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@class=\"mat-option-text\"][text()=' ss ']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//DIV[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//DIV[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//mat-icon[contains(text(),'near_me')]")).click();
		 
		}
	
		

	}


