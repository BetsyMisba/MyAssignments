package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
driver.findElement(By.id("ext-gen248")).sendKeys("BetsyMisba");
driver.findElement(By.className("x-btn-text")).click();

String title = driver.getTitle();
if (title.contains("View Lead")) {
System.out.println("Title is "+ title);
}
else {
	  System.out.println("Title Mismatch");
}

driver.findElement(By.xpath("//a[text()='Edit']")).click();
driver.findElement(By.id("updateLeadForm_companyName")).clear();
driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("NewCompany");
driver.findElement(By.xpath("//input[@value='Update']")).click();
String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
System.out.println("Changed Company name is "+text);



	}

}
