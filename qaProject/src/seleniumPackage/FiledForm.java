package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FiledForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/Users/kishanrao/Downloads/geckodriver"); 
		FirefoxDriver browserObject = new FirefoxDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("https://www.training.qaonlinetraining.com/testPage.php");
	        
	        
	        
	        browserObject.findElement(By.name("name")).sendKeys("Kishan");
	        browserObject.findElement(By.name("email")).sendKeys("kishanjay23@gmail.com");
	        browserObject.findElement(By.name("website")).sendKeys("espn.com");
	        browserObject.findElement(By.name("comment")).sendKeys("Hi");
	        
	        
	        // Radio Button
	        browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	        //Check Box
	        browserObject.findElement(By.name("bike")).click();
	        browserObject.findElement(By.name("car")).click();
	        browserObject.findElement(By.name("boat")).click();
	        browserObject.findElement(By.name("horse")).click();
	        
	        //Dropdown
	        Select countrySelect = new Select(browserObject.findElement(By.name("country")));
	        
			// 5. Using the object of Select class call the selectByVisibleText method and select text in dropdown
		        countrySelect.selectByVisibleText("USA"); //options [USA,India, Ethiopia,France]
		        //or
		        Thread.sleep(4000);
		        countrySelect.selectByVisibleText("France");
		        
		       // Same explanation for skill dropdown 
		        Select skillSelect = new Select(browserObject.findElement(By.name("skill")));
		        //using skillSelect to select menu options -- Programming
		        skillSelect.selectByVisibleText("Programming");
		        Thread.sleep(4000);
		        skillSelect.selectByVisibleText("Database");
		        System.out.println("selectByVisibleText(\"Database");
		        
		     
		        System.out.println("Form Fill-up Succesfull");
			// 7. Close the web browser
		       
	        
	        
	        
	        
	        
	        browserObject.findElement(By.name("submit")).click();
	}

}
