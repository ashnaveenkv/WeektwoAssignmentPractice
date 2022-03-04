package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentsfouredit {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ash.naveen.kv@gmail.com");
		
		WebElement append = driver.findElement(By.xpath("(//label[@for='email'])[2]/following-sibling::input"));
		
		//String attribute = append.getAttribute("value");
		//System.out.println(attribute);
		
		append.sendKeys("Naveenraj" +Keys.TAB);
		
		String textboxvalue = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value");
		System.out.println("Value under textbox is :"+textboxvalue);
		
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		
		if(enabled)
		{
			System.out.println("Textbox is enabled");
		}
		else
		{
			System.out.println("Textbox is not enabled");
		}
		
	}
	
}
