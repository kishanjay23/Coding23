package seleniumPackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/Users/kishanrao/Downloads/geckodriver"); 
		FirefoxDriver browserObject = new FirefoxDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.amazon.com/");
	}

}
