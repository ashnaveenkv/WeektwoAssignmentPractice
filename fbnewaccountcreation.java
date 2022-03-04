package week2.assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class fbnewaccountcreation {
	
	
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	//WebDriverWait wait=new WebDriverWait(driver, 20);
	driver.get(" https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20))  ;
	driver.findElement(By.xpath("(//div[@class='_6ltg']/a[1])")).click();
	driver.findElement(By.xpath("//input[@name= 'firstname']")).sendKeys("Naveenraj");
	driver.findElement(By.xpath("//input[@name= 'lastname']")).sendKeys("Rajendran");
	driver.findElement(By.xpath("//input[@name= 'reg_email__']")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password");
	
	WebElement Day = driver.findElement(By.id("day"));
	Select birthday = new Select(Day);
	birthday.selectByVisibleText("26");
	
	WebElement Month = driver.findElement(By.id("month"));
	Select birthmonth = new Select(Month);
	birthmonth.selectByVisibleText("Jan");
	
	WebElement year = driver.findElement(By.id("year"));
	Select birthyear = new Select(year);
	birthyear.selectByVisibleText("1990");
	
	driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
	//driver.findElement(By.id("((//div[@class='_1lch'])/button[1]")).click();
	
	driver.quit();
		
		
	}

}
