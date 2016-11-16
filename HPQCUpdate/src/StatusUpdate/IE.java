package StatusUpdate;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {
	
	WebDriver driver = new InternetExplorerDriver();

	@Test
	public  void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\RAGIA SULTANA\\Desktop\\IEDriverServer.exe");
		
		
		driver.get("http://10.179.94.22:8080/qcbin/start_a.jsp");
	}

}
