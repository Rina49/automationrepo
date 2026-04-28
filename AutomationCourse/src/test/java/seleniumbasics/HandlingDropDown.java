package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	
	
	public void verifyDropDown() {
		
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropdown);
		//1.selectByIndex
		//select.selectByIndex(2);
		//2.selectByValue
		//select.selectByValue("c#");
		//3.selectByVisibleText
		select.selectByVisibleText("SQL");
	}
	
	public void verifyCheckBox() {
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='option-2']"));
		checkbox2.click();
		
		
	}
	
	public void verifyRadioButton() {
		
		WebElement radio = driver.findElement(By.xpath("//input[@value='yellow']"));
		radio.click();
	}

	public static void main(String[] args) {
		HandlingDropDown handlingdropdown = new HandlingDropDown();
		handlingdropdown.browserLaunch();
		handlingdropdown.verifyDropDown();
		handlingdropdown.verifyCheckBox();
		handlingdropdown.verifyRadioButton();
		

	}

}
