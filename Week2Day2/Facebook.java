package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.linkText("Create New Account")).click();
driver.findElement(By.name("firstname")).sendKeys("Betsy");
driver.findElement(By.name("lastname")).sendKeys("Misba");
driver.findElement(By.name("reg_email__")).sendKeys("misba.betsy@gmail.com");
driver.findElement(By.name("reg_passwd__")).sendKeys("9894070458");

WebElement dropdown=driver.findElement(By.id("day"));
Select drop=new Select(dropdown);
drop.selectByIndex(25);

WebElement dropdown1=driver.findElement(By.name("birthday_month"));
Select dm=new Select(dropdown1);
dm.selectByIndex(5);

WebElement dropdown2=driver.findElement (By.name("birthday_year"));
Select dy=new Select(dropdown2);
dy.selectByValue("1987");

driver.findElement(By.xpath("//label[text ()='Female']")).click();
driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();












	}

}
