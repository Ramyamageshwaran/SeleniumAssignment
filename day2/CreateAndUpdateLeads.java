package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreateAndUpdateLeads {

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
				//Create Leads
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				//Enter the First Name
				driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input")).sendKeys("Ramya");
				//Click Find leads button
				driver.findElement(By.xpath("//button[@class='x-btn-text'][@type='button'][@id='ext-gen841']")).click();
				// Click on first resulting lead
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//child::a")).click();		
				//Print the current title
				String currentTitle = driver.getTitle();  
				System.out.println(currentTitle);
				//Click Edit
				driver.findElement(By.xpath("//a[@class='subMenuButton'][text()='Edit']")).click();
				//Clear the company name
				driver.findElement(By.xpath("//input[@class='inputBox'][@name='companyName']")).clear();
				//Change the Company Name
				driver.findElement(By.xpath("//input[@class='inputBox'][@name='companyName']")).sendKeys("LeafGround");
				//Click Update
				driver.findElement(By.xpath("//input[@class='smallSubmit'][@name='submitButton'][@value='Update']")).click();
				Thread.sleep(5000);
				// Confirm the changed name appears
				String viewUpdateCompanyName = driver.findElement(By.xpath("//span[@class='tabletext'][@id='viewLead_companyName_sp']")).getText();  
				System.out.println(viewUpdateCompanyName);
				driver.close();
		}   

}
