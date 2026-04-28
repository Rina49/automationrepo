package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	
	public void verifySimpleAlert() {
		
		
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.id("alertButton"));
		simplealert.click();
		Alert alert = driver.switchTo().alert();// transfer control from webpage to alert popup using switchto()
		alert.accept(); //ok button
		
		
		
	}
	
	public void verifyConfirmAlert() {
		
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert = driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Alert alert = driver.switchTo().alert();// transfer control from webpage to alert popup using switchto()
		alert.dismiss(); //cancel button
	}
	
	public void verifyPromptAlert() {
		
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement prompt = driver.findElement(By.id("promtButton"));
		prompt.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Rina");
		alert.accept();
		
		
	
	}

	public static void main(String[] args) {
		AlertHandling alerthandling = new AlertHandling();
		alerthandling.browserLaunch();
		//alerthandling.verifySimpleAlert();
		//alerthandling.verifyConfirmAlert();
		alerthandling.verifyPromptAlert();
		

	}

}
