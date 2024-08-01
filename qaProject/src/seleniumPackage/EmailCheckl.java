package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmailCheckl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/kishanrao/Downloads/chromedriver-mac-x64/chromedriver");
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open login page of https://admin-demo.nopcommerce.com/login
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	    
	        WebElement email=browserObject.findElement(By.name("Email"));
	       email.clear();
	        email.sendKeys("admin@yourstore.com");
	        
	      WebElement pass=  browserObject.findElement(By.name("Password"));
	      pass.clear();
	        pass.sendKeys("admin");
	        browserObject.findElement(By.className("login-button")).click();
	}

}
