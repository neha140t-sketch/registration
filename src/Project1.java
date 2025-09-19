package emilo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Start browser
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.get("https://emilo-live-stream-front.vercel.app/register");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         // Fill the form fields
            WebElement fullName = wait.until(ExpectedConditions.elementToBeClickable(By.name("name")));
            fullName.sendKeys("Test User");

            WebElement email = driver.findElement(By.name("email"));
            email.sendKeys("testuser" + Math.random() + "@example.com");

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("StrongPass123!");

            WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
            confirmPassword.sendKeys("StrongPass123!");

            // Click Create Account button
            WebElement createAccountBtn = driver.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
            createAccountBtn.click();

            // Print confirmation
            System.out.println("Registration form submitted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
        }
    }
}
	


