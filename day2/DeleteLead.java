package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		// create the object for launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the URL http://leaftaps.com/opentaps/control/login
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(30));
		//Find the element username Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		//Find the element password Enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//click Login Button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//Click on CRM/SFA
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		//Click Leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//Find Leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter Country code in phone number
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();		
		//Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9940677285");
		//Click Leads
		driver.findElement(By.xpath("//button[@class='x-btn-text'][text()='Find Leads']")).click();
		Thread.sleep(3000);
		//Capture lead ID of First Resulting lead
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]//child::a")).click();
		//Click Delete
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous'][text()='Delete']")).click();
		//Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Verify using Lead ID in the Lead List
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("12007");
		//Verify message "No records to display" in the Lead List		
		driver.findElement(By.xpath("//button[@class='x-btn-text'][text()='Find Leads']")).click();
		//Close the browser
		driver.close();
	}

}
