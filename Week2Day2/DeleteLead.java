package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//*[@id='ext-gen270']")).sendKeys("9629725256");
		driver.findElement(By.xpath("//*[@class='x-btn-text']")).click();
		
	
	      String idtest = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
	      System.out.println(idtest);
	      driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
	   
	      driver.findElement(By.xpath("//a[text()='Delete']")).click();
	      driver.findElement(By.linkText("Find Leads")).click();
   
	      driver.findElement(By.xpath("//input[@name='id']")).sendKeys(idtest);
	      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	      String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	      System.out.println(text);
	      
	      if (text.contains("No records to display")) {
			
	    	  System.out.println("Lead Deleted");
		} 
	      else {
				
			System.out.println("Lead not Deleted");
		}
	      
	      
	      
	}

}
