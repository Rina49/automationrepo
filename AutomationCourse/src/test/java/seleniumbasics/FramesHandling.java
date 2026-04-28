package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesHandling extends Base{
	
	public void verifyFrames() {
		
		driver.navigate().to("https://demoqa.com/frames");
		//frame properties always comes inside iframe tag.
		List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		System.out.println(totalframe.size());
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1); //switching to frame
		WebElement heading = driver.findElement(By.id("sampleHeading"));
		System.out.println(heading.getText());
		driver.switchTo().defaultContent(); //control back to driver
	}

	public static void main(String[] args) {
		FramesHandling frame = new FramesHandling();
		frame.browserLaunch();
		frame.verifyFrames();

	}

}
