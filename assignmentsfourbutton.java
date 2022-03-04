package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignmentsfourbutton {

public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leafground.com/pages/Button.html");
	
// Get Position //	
	 System.out.println(driver.findElement(By.id("position")).getLocation());

//	Get Position // 
	 WebElement getposition = driver.findElement(By.xpath("//button[@id='position']"));
	 Point naveen = getposition.getLocation();
	 System.out.println(naveen);
	
// Get Colour //	 
	 System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));
	
// Get Colour //	 
	 WebElement getcolour = driver.findElement(By.xpath("//button[@id='color']"));
	 String colour = getcolour.getCssValue("background-color");
	 System.out.println(colour);
	 
//Get Size //
	 
	WebElement size = driver.findElement(By.xpath("//button[@id='size']"));
	///get width//
	int sizeofwidth = size.getSize().getWidth();
	System.out.println(sizeofwidth);
	///get height//
	int sizeofheight = size.getSize().getHeight();
	System.out.println(sizeofheight);
	//height and weight//
	Dimension widthandheight = size.getSize();
	System.out.println(widthandheight);
	
	
	
	driver.quit();
}	
}