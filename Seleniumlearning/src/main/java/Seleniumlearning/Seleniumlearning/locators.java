package Seleniumlearning.Seleniumlearning;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankit\\BrowserDrivers\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--start-maximized");
		Options.addArguments("--enable-logging");
		WebDriver driver = new ChromeDriver();
		driver.get("https://income-tax-and-gst-solution.b12sites.com/index#services");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='items-grid__header h3'][1]")).click();
		driver.findElement(By.cssSelector(".sb-cta-wrapper__btn.sb-button.sb-button--primary[data-component-field='linkRaw']")).click();
		 WebElement activeDayButton = wait.until(ExpectedConditions.elementToBeClickable(
	     By.xpath("//span[normalize-space()='16']") )); activeDayButton.click();
	     WebElement timeSlot = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'–4:30 pm')]")));timeSlot.click();
			driver.findElement(By.cssSelector("span[class*='appointment-calendar__timezone-toggle-dropdown-btn-text']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Jane Smith']")).sendKeys("Suyash Prakash");
			driver.findElement(By.xpath("//input[@name= 'from_email']")).sendKeys("ankurs753@gmail.com");
			driver.findElement(By.xpath("//input[@name= 'from_phone']")).sendKeys("7531902835");
			driver.findElement(By.xpath("//label[@for='63cc9904-bc92-4bdd-8736-b171b053f0b9-c91b4f29-ef3e-4e6a-a0b9-782754bc62e7']")).click();
			driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Hi this is a Automated Test Script. for Learning purpose only Suyash");
			WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
			submitButton.click();



			
					
	}

}









            
	           
	                
	                        
	                    
	                    

