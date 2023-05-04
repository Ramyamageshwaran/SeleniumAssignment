package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccountInFaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//Load the URL http://leaftaps.com/opentaps/control/login
		driver.get("https://en-gb.facebook.com/");
		//maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(30));
		//Click the Create new account Button
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        //Enter First name
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ramya");
        //Enter Last name
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mageshwaran");
        //Enter Mobile Number
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9840755869");
        //Enter Password
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ramyamag23");
        //Select the Birthday Date in drop down list
        WebElement Birthdaydate=driver.findElement(By.xpath("//Select[@id='day']"));
        Select source=new Select(Birthdaydate);
        source.selectByVisibleText("23");
        //Select the Birthday Month in drop down list
        WebElement Birthdaymonth=driver.findElement(By.xpath("//Select[@id='month']"));
        Select source1=new Select(Birthdaymonth);
        source1.selectByValue("4");
        //Select the Birthday Year in drop down list
        WebElement Birthdayyear=driver.findElement(By.xpath("//Select[@id='year']"));
        Select source2=new Select(Birthdayyear);
        source2.selectByVisibleText("1983");
        //Select the Gender in Option Button
        driver.findElement(By.xpath("//label[text()='Female']")).click();
                  		
	}

}
