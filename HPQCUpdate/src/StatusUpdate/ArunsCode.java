package StatusUpdate;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ArunsCode {

	@Test(priority = 1)
	 public void switchWin() throws Exception, Exception
	{
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.ultimatix.net");
		
		driver.manage().window().maximize();
		
		File src = new File("C:\\Users\\RAGIA SULTANA\\Desktop\\Nazneen\\Automation\\Credentials.xls");
		System.out.println("Excel located");
		
		Workbook wb = Workbook.getWorkbook(src);
		System.out.println("Workbook loaded and Credentials Obtained");

		String Username = wb.getSheet(0).getCell(0, 0).getContents();
		System.out.println("Data is "+Username);

		String Password = wb.getSheet(0).getCell(1, 0).getContents();
		System.out.println("Data is "+Password);
		
		WebElement usr = driver.findElement(By.id("USER"));
		usr.sendKeys(Username);	
		
		WebElement pwd = driver.findElement(By.id("PASSWORD"));
		pwd.sendKeys(Password);	
		
		WebElement submit = driver.findElement(By.id("login_button"));
		submit.click();	
		
		driver.manage().window().maximize();
		
		WebElement tmsht = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/span/div/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/div/span/div/div[2]/table[2]/tbody/tr[2]/td/div/div[5]/a"));
		
		String handle = driver.getWindowHandle(); //Handle of parent window
		
		tmsht.click();
		
		Set<String> handles = driver.getWindowHandles(); //All the window handles
		
		for (String hnd:handles)
			
		{
						
			if(!hnd.equalsIgnoreCase(handle)) //to check if the handle is not parent
			{
				driver.switchTo().window(hnd); //change control to login window
			}			
		
		}
				
			System.out.println(driver.getTitle());
			
			Thread.sleep(4000);
			
		WebElement hrs = driver.findElement(By.xpath("//input[@id='effortAssign01']"));
		CharSequence val = hrs.getAttribute("value");
		System.out.println("The value of hours present is :" +val);
	
		if(val.equals("9"))
		{
			Thread.sleep(4000);
			
			driver.close();
			
			driver.switchTo().window(handle);
			
			System.out.println(driver.getTitle());
			
			WebElement lgout1 = driver.findElement(By.linkText("Logout"));
			
			System.out.println("Logout button identifed");
		    
			lgout1.click(); 
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='logoutbutton']")).click();
			
		driver.close();
		
		}
		
		
		else if(val.equals("0"))
			
		{
			
		hrs.clear();
		hrs.sendKeys("9");
		System.out.println("9 hours effort entered");
		
		driver.findElement(By.xpath("//div[@id='branchLocationContainer']")).click();
		System.out.println("Random Click successful");
		
		/*WebElement rd = driver.findElement(By.xpath("//div[@id='copyDiv']/div[3]/span/input"));
		rd.click();
		System.out.println("radio button found"); */
		
		WebElement sub = driver.findElement(By.xpath("//input[@value='Submit']"));
		sub.click();
		System.out.println("Submitted successfully");
		
	Thread.sleep(4000);
	
	driver.close();
	
	driver.switchTo().window(handle);
	
	System.out.println(driver.getTitle());
	
	WebElement lgout = driver.findElement(By.linkText("Logout"));
	
	System.out.println("Logout button identifed");
    
	Thread.sleep(2000);
	
	lgout.click(); 
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='logoutbutton']")).click();
	
	driver.close();
		}
	
	}

}