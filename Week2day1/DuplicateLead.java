package Week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("BetsyMisba");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Johnson");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("BetsyJ");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Testing");
			driver.findElement(By.id("createLeadForm_EmailAddress")).sendKeys("misba.betsy@gmail.com");
			driver.findElement(By.name("submitButton")).click();
			
			System.out.println(driver.getTitle());
			driver.findElement(By.linkText("Duplicate Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("BetsyMisba Johnson");
			driver.findElement(By.name("submitButton")).click();
			System.out.println(driver.getTitle());
			
			
			
			
			}



	}


