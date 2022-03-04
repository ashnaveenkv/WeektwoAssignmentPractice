package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]") ).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Phone")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		driver.findElement(By.xpath("(//td[@class='x-btn-center']//button)[7]")).click();
		Thread.sleep(2000);
		String FirstID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).getText();
		Thread.sleep(2000);
		System.out.println("Id is:"+FirstID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		System.out.println("Title is"+driver.getTitle());
		driver.findElement(By.partialLinkText("Delete")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Find Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(FirstID);
		driver.findElement(By.xpath("(//td[@class='x-btn-center']//button)[7]")).click();
	    Thread.sleep(2000);
		String message = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']//div[@class='x-paging-info']")).getText();
		System.out.println(message);
		
		if(message.equals("No records to display"))
		{
			System.out.println("The ID" +FirstID +" has been deleted");
		}
		else System.out.println("Not Deleted");
		
		driver.quit();

		
		
		
	}

}
