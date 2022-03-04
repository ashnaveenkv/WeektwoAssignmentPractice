package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
			username.sendKeys("Demosalesmanager");
			WebElement pwd= driver.findElement(By.xpath("//input[@id='password']"));
			pwd.sendKeys("crmsfa");
			WebElement submitbtn = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
			submitbtn.click();
			WebElement  CRMsfalink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]") );
			CRMsfalink.click();
			driver.findElement(By.partialLinkText("Contacts")).click();
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Create Contact")).click();
			driver.findElement(By.xpath("//input[@id = 'firstNameField']")).sendKeys("Naveenraj");
			driver.findElement(By.xpath("//input[@id = 'lastNameField']")).sendKeys("Rajendran");
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Naveenlocal");
			driver.findElement(By.xpath("//input[@id = 'createContactForm_lastNameLocal']")).sendKeys("Rajendranlocal");
			driver.findElement(By.xpath("//input[@name = 'departmentName']")).sendKeys("Departments");
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Description");
			driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("ash.naveen.kv@gmail.com");
		WebElement State =	driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select st = new Select(State);
		st.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.partialLinkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Note");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String Title = driver.getTitle();
		System.out.println("Title of Resulting Page:" +Title);
		driver.quit();
	
	//	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			
			
			
			
			
			
		 
	

		
	}

}
