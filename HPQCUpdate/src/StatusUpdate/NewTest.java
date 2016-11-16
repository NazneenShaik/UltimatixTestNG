package StatusUpdate;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	 
	 WebDriver driver = new FirefoxDriver();
	 @Test 
  public void f() throws InterruptedException {
	 
	  
		driver.get("https://www.ultimatix.net");
		System.out.println("URL hit successful");
		
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("USER"));
		System.out.println("Xpath Identified");
		user.sendKeys("843108");
		
		WebElement password = driver.findElement(By.id("PASSWORD"));
		password.sendKeys("Sonumonu@786l22");
		
		WebElement login = driver.findElement(By.id("login_button"));
		login.click();
		
		Thread.sleep(6000);
		
		WebElement timeSheet = driver.findElement(By.xpath(".//*[@id='myFavorites']/div/div[3]/a"));
		timeSheet.click();
		
		TakesScreenshot();
		
		Thread.sleep(6000);
		
		
		timeSheet.sendKeys(Keys.ALT);
		timeSheet.sendKeys(Keys.TAB);
		
		WebElement logout = driver.findElement(By.xpath(".//*[@id='uam_modal']"));
		logout.click();
		
		WebElement Completelogout = driver.findElement(By.xpath(".//*[@id='logoutbutton']"));
		Completelogout.click();
	 }
	 
	 private void TakesScreenshot() {
		// TODO Auto-generated method stub
		
	}

	private WebElement findElement(By xpath) {
			// TODO Auto-generated method stub
			return null;
	 }
	 
		
  }
