package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {

	public void verifyTable() {
		
		//to get full date from the table
		driver.navigate().to(" https://money.rediff.com/indices/nse");
		WebElement table = driver.findElement(By.id("dataTable"));
		//System.out.println(table.getText());
		
		//to get the 3rd row data from table
		WebElement row = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]"));
		System.out.println(row.getText());
	}
	public static void main(String[] args) {
		TableHandling tablehandle = new TableHandling();
		tablehandle.browserLaunch();
		tablehandle.verifyTable();

	}

}
