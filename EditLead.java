package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	public static void main(String[] args) throws InterruptedException {

	
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
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	System.out.println("Title IS :"+driver.getTitle());
	driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[3]")).click();
	driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
	driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TestsLeafs");
	//String Enteredelement = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).getText();
	//System.out.println("Entered Element " +Enteredelement);
	driver.findElement(By.xpath("(//td[@colspan='4']/input)[1]")).click();
	String printedelement = driver.findElement(By.xpath("//span[@id = 'viewLead_companyName_sp']")).getText();
	

	System.out.println("Printed lement" +printedelement);
	
	driver.quit();
	
	

}
}