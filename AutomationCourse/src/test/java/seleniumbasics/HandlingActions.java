package seleniumbasics;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{

	
	public void verifyRightClik() {
		WebElement othermenu = driver.findElement(By.id("others"));
		Actions actions = new Actions(driver);
		actions.contextClick(othermenu).build().perform();
	}
	public static void main(String[] args) {
		HandlingActions act = new HandlingActions();
		act.browserLaunch();
		act.verifyRightClik();

	}

}
