package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LInkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver browserObject;
	       // 1. setup the property of WebDriver to perform "linktext" through chrome web browser.
		System.setProperty("webdriver.gecko.driver","/Users/kishanrao/Downloads/geckodriver"); 
		// 2. Initialize WebDriver object through ChromeDriver class.
	        browserObject = new FirefoxDriver();
	       
		// 3. Open the web page https://www.google.com/
	        browserObject.get("https://www.google.com/");
		// 4. The value of text link is stored in bloglink reference . Here TextLink is a locator that checks wether a text is link or not.		  
	        WebElement blogLink = browserObject.findElement(By.linkText("Gmail"));
				  
				 
		// 5. If the text is form of link then its displayed or else will not display
	        if (blogLink.isDisplayed()) {
	            System.out.println("Gmail link is diplayed usingLinkText");
	        } else {
	            System.out.println("Unable to find Gmail");
	        }
		// 6. Close the browser
	        browserObject.close();
	}

}
