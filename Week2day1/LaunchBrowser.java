package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativesumit")).click();
String title=driver.getTitle();
System.out.println("title");
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("CreateLeadForm_companyName")).sendKeys("Test Leaf");
driver.findElement(By.id("CreateLeadForm_FirstName")).sendKeys("Principal");
driver.findElement(By.id("CreateLeadForm_LastName")).sendKeys("Edward");
driver.findElement(By.name("SubmitButton")).click();
System.out.println(title);
String title2=driver.getTitle();
if(title2.contains("view Lead")) {
	System.out.println("The page loaded");
	
}
else {
System.out.println("This page not loaded");
}
}
}

