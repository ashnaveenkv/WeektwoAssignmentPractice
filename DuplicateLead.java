package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");	

		WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("Demosalesmanager");
		WebElement pwd= driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("crmsfa");
		WebElement submitbtn = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		submitbtn.click();
		WebElement  CRMsfalink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]") );
		CRMsfalink.click();
		WebElement leadlink = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		leadlink.click();
			driver.findElement(By.partialLinkText("Find Leads")).click();
			Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Email")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("ash.naveen.kv@gmail.com");
		driver.findElement(By.xpath("(//button[@class = 'x-btn-text'])[7]")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
		driver.findElement(By.partialLinkText("Duplicate Lead")).click();
		String duplicatelead = driver.getTitle();
		System.out.println(duplicatelead);
		driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
		String name = driver.findElement(By.xpath("//span[@id= 'viewLead_firstName_sp']")).getText();
		
		if(text.equals(name))
		{
			System.out.println("Both are same");
		}
			
		driver.quit();
	}

}
