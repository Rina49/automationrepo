package seleniumbasics;

import org.openqa.selenium.By;

public class Locators extends Base{
	
	public void verifyLocators() {
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Select Input"));
		driver.findElement(By.partialLinkText("Select"));
		
		//tagname[attribute='attribute value']
		driver.findElement(By.cssSelector("button[id='button-one']"));
		
		/*absolute xpath
		/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button
		 
		 */
		
		//relative xpath
		//tagname[@attribute='attribute value']
		
		driver.findElement(By.xpath("//button[@id='button-two']"));
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		
		//xpath using And operator
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		
		//xpath using or operator
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button'-one-electronics]"));
		
		//parent
		driver.findElement(By.xpath(" //div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		//child
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		//following
		driver.findElement(By.xpath(" //button[@id='button-one']//following::div[@clas s='card']"));
		//preceding
		driver.findElement(By.xpath(" //button[@id='button-one']//preceding:: div[@class='card']"));
		//ancestor
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		//to choose one of six
		//button[@id='button-one']//ancestor::div[1]
		//descendant
		 driver.findElement(By.xpath(" //div[@class='card']//descendant::div[2]"));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
